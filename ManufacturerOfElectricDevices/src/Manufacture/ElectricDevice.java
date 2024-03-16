package Manufacture;

public class ElectricDevice {

    private Manufacturer manufacturer;
    private int minPeriodOfWarantyInMonths;
    private int warranty;

    public ElectricDevice(Manufacturer manufacturer, int minPeriodOfWarantyInMonths) {
        this.manufacturer = manufacturer;
        this.minPeriodOfWarantyInMonths = minPeriodOfWarantyInMonths;
    }

   public int warranty(){
        warranty = minPeriodOfWarantyInMonths;
        if(manufacturer.isProvidesExtendedWaranty()){
            warranty = minPeriodOfWarantyInMonths + 12;
        }
       return warranty;
   }

    public int getMinPeriodOfWarantyInMonths() {
        return minPeriodOfWarantyInMonths;
    }

    public void setMinPeriodOfWarantyInMonths(int minPeriodOfWarantyInMonths) {
        this.minPeriodOfWarantyInMonths = minPeriodOfWarantyInMonths;
    }

    @Override
    public String toString() {
        return "ElectricDevice{" +
                "manufacturer=" + manufacturer +
                ", minPeriodOfWarantyInMonths=" + minPeriodOfWarantyInMonths +
                '}';
    }
}
