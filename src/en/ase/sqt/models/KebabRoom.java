package en.ase.sqt.models;

import java.util.ArrayList;
import java.util.List;

public class KebabRoom extends AbstractDevice{
    List<AbstractDevice> list;
    public KebabRoom(String name) {
        super(name);
        this.list =new ArrayList<>();
    }

    @Override
    public void getReport() {
        System.out.println("Room: "+name);
        System.out.println("Total energy used: "+getEnergy()+" kWh");
    }


    @Override
    public void addDevice(AbstractDevice device) {
        list.add(device);
    }

    @Override
    public void removeDevice(int index) {
        list.remove(index);
    }

    @Override
    public AbstractDevice getDevice(String name) {
        for (AbstractDevice device: list){
            if(device.name.equals(name)){
                return device;
            }
        }
        return null;
    }

    @Override
    int getEnergy() {
        return list.stream().mapToInt(AbstractDevice::getEnergy).sum();
    }
}
