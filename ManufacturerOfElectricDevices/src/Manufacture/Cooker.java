package Manufacture;

public class Cooker extends ElectricDevice{

   private boolean isGasCooker;

   private int warranty;

    public Cooker(Manufacturer manufacturer, int minPeriodOfWarantyInMonths, boolean isGasCooker) {
        super(manufacturer, minPeriodOfWarantyInMonths);
        this.isGasCooker = isGasCooker;
        this.warranty = super.warranty();
    }

    public boolean isGasCooker() {
        return isGasCooker;
    }

    public void setGasCooker(boolean gasCooker) {
        isGasCooker = gasCooker;
    }

    public int warranty(){
        if(isGasCooker()){
            return warranty + 12;
        }
        return warranty;
    }

    @Override
    public String toString() {
        return "Cooker{" + super.toString() +
                "isGasCooker=" + isGasCooker +
                "} ";
    }
}
