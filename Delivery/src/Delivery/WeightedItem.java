package Delivery;

public class WeightedItem extends Material implements Deliverable{

    private double weight;
    private double pricePerKg;

    public WeightedItem(String name, boolean isFragile, double weight, double pricePerKg) {
        super(name, isFragile);
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public int deliveryPrice() {
        return 0;
    }
}
