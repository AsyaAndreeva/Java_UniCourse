import Shop.Goods;
import Shop.Sellable;
import Shop.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(10, 3000, 4000);
        Vehicle vehicle2 = new Vehicle(20, 6000, 5000);

        Sellable sellable= vehicle1;
        Goods goods = vehicle2;

        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println(vehicle1.productionPrice());
        System.out.println(vehicle1.sellingPrice());

        System.out.println(vehicle2.productionPrice());
        System.out.println(vehicle2.sellingPrice());
    }
}