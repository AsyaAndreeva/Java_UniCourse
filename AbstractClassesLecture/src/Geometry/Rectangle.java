package Geometry;

public class Rectangle extends Figure implements Perimeter{
    @Override
    public double area(){
        return this.getDim1()*this.getDim2();
    }
    @Override
    public double perimeter() {
        return 0;
    }
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }



}
