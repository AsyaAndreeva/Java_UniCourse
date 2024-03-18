import Geometry.Figure;
import Geometry.Rectangle;
import Geometry.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Figure figure;
        Triangle triangle = new Triangle(5, 5);
        Rectangle rectangle = new Rectangle(5, 5);

        figure = triangle;
        System.out.println(figure.area());
        figure = rectangle;
        System.out.println(figure.area());
    }
}