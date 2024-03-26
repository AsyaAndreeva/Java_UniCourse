package Delivery;

public abstract class DeliverableItem implements Deliverable{

    private boolean toClientsAddress;

    private double additionalPrice;

    public DeliverableItem(boolean toClientsAddress) {
        this.toClientsAddress = toClientsAddress;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    @Override
    public int deliveryPrice() {
        return 0;
    }
}
