package Manufacture;

public class Manufacturer {

    private String name;
    private boolean providesExtendedWaranty;

    public Manufacturer(String name, boolean providesExtendedWaranty) {
        this.name = name;
        this.providesExtendedWaranty = providesExtendedWaranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProvidesExtendedWaranty() {
        return providesExtendedWaranty;
    }

    public void setProvidesExtendedWaranty(boolean providesExtendedWaranty) {
        this.providesExtendedWaranty = providesExtendedWaranty;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", providesExtendedWaranty=" + providesExtendedWaranty +
                '}';
    }
}
