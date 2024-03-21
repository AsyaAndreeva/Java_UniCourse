package Shop;

public abstract class Goods implements ProducableAndSellable{
    private double overcharge;

    public Goods(double overcharge) {
        this.overcharge = overcharge;
    }

    @Override
    public double sellingPrice(){
        return this.productionPrice() * this.overcharge/100 + this.productionPrice();
    }

    public double getOvercharge() {
        return overcharge;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "overcharge=" + overcharge +
                '}';
    }
}
