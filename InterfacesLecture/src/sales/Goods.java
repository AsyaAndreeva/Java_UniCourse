package sales;

public abstract class Goods implements itemForSale{
    private double overcharge;

    @Override
    public double sellingPrice(){
        return this.productionPrice() + this.productionPrice()*this.overcharge;
    }



}
