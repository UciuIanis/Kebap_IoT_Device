package en.ase.sqt.models;

public abstract class AbstractDevice {
    String name;

    public AbstractDevice(String name) {
        this.name = name;
    }

    public abstract void getReport();
    public abstract void addDevice(AbstractDevice device);
    public abstract void removeDevice(int index);
    public abstract AbstractDevice getDevice(String name);
    abstract int getEnergy();
}
