package Vehicles;

public class Vehicle {
    private double engineVolume;

    private double price;

    public Vehicle(double engineVolume, double price) {
        this.engineVolume = engineVolume;
        this.price = price;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vehicle{" +
                "engineVolume=" + engineVolume +
                ", price=" + price +
                '}';
    }
}
