package Manufacture;

public class WashingMachine extends ElectricDevice{

    private boolean includesDryingFunc;

    private int warranty;

    public WashingMachine(Manufacturer manufacturer, int minPeriodOfWarantyInMonths, boolean includesDryingFunc) {
        super(manufacturer, minPeriodOfWarantyInMonths);
        this.includesDryingFunc = includesDryingFunc;
        this.warranty = super.warranty();
    }

    public boolean isIncludesDryingFunc() {
        return includesDryingFunc;
    }

    public void setIncludesDryingFunc(boolean includesDryingFunc) {
        this.includesDryingFunc = includesDryingFunc;
    }


    public int warranty(){
        if(isIncludesDryingFunc()){
            return warranty + getMinPeriodOfWarantyInMonths()/2;
        }
        return warranty;
    }

    @Override
    public String toString() {
        return "WashingMachine{" + super.toString() +
                "includesDryingFunc=" + includesDryingFunc +
                "} ";
    }
}
