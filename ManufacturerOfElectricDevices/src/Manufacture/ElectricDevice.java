package Manufacture;

import static java.lang.Math.max;

public class ElectricDevice {

    private Manufacturer manufacturer;
    private int minPeriodOfWarantyInMonths;
    private int warranty;

    public ElectricDevice(Manufacturer manufacturer, int minPeriodOfWarantyInMonths) {
        this.manufacturer = manufacturer;
        this.minPeriodOfWarantyInMonths = max(minPeriodOfWarantyInMonths, 6);
    }

   public int warranty(){
        warranty = minPeriodOfWarantyInMonths;
        if(manufacturer.isProvidesExtendedWaranty()){
            warranty = minPeriodOfWarantyInMonths + 12;
        }
       return warranty;
   }

    public int getMinPeriodOfWarantyInMonths() {
        return max(minPeriodOfWarantyInMonths, 6);
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
