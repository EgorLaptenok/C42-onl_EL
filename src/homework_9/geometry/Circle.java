package homework_9.geometry;

import static java.lang.Math.PI;
public class Circle extends Figure{
    String nameFigure = "Круг";
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2.0 * PI * radius;
    }
    @Override
    public double getSquare() {
        return PI * radius * radius;
    }
    @Override
    public String getName() {
        return nameFigure;
    }
}