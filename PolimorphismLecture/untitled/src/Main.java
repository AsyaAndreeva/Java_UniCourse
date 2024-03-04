import Vehicles.Bus;
import Vehicles.Vehicle;
public class Main {
    public static void main(String[] args){
        Bus bus = new Bus(2000, 1000, 40);
        System.out.println(bus);

        Vehicle vehicle = new Bus(2000, 10000, 40);
        System.out.println(vehicle);
    }
}
