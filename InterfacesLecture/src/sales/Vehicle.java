package sales;

public class Vehicle extends Goods{

    private double salary;
    private double materials;
    @Override
    public double productionPrice() {
        return this.materials+this.salary;
    }
}
