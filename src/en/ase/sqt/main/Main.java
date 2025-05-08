package en.ase.sqt.main;

import en.ase.sqt.models.KebabDevice;
import en.ase.sqt.models.KebabRoom;

public class Main {
    public static void main(String[] args) {
        KebabDevice device1 = new KebabDevice("phone", 10);
        KebabDevice device2 = new KebabDevice("tablet", 25);
        KebabDevice device3 = new KebabDevice("laptop", 54);

        KebabRoom room1 = new KebabRoom("Dining area");
        KebabRoom room2 = new KebabRoom("Toilet");

        room1.addDevice(device1);
        room1.addDevice(device3);

        room2.addDevice(device2);
        room1.addDevice(room2);

        device1.getReport();
        room2.getReport();
        room1.getReport();
    }
}
