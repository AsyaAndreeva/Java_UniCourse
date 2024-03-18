package Geometry;

public class Triangle extends Figure{
    @Override
    public double area(){
        return (this.getDim1()*this.getDim2())/2;
    }

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
}
