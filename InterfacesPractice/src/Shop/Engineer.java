package Shop;

public class Engineer implements Provider{

    private double perHour;

    private double hoursWorked;

    public Engineer(double perHour, double hoursWorked) {
        this.perHour = perHour;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double earnings() {
        return this.hoursWorked*this.hoursWorked;
    }
}
