package Vehicles;

public class Bus extends Vehicle{

   private int numberOfSeats;

    public Bus(double engineVolume, double price, int numberOfSeats) {
        super(engineVolume, price);
        this.numberOfSeats = numberOfSeats;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bus{" + super.toString() +
                "numberOfSeats=" + numberOfSeats +
                "} ";
    }
}
