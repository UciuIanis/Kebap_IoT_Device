package en.ase.sqt.models;

public class KebabDevice extends AbstractDevice{
    int energyConsumption;

    public KebabDevice(String name, int energyConsumption) {
        super(name);
        this.energyConsumption = energyConsumption;
    }

    @Override
    public void getReport() {
        System.out.println("Device: "+name+"\nEnergy consumption: "+energyConsumption+" kWh");
    }

    @Override
    public void addDevice(AbstractDevice device) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeDevice(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractDevice getDevice(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    int getEnergy() {
        return energyConsumption;
    }
}
