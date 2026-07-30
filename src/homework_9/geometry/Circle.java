package homework_9.geometry;

import static java.lang.Math.PI;
public class Circle extends Figure{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void setPerimeter() {
        super.perimeter = 2.0 * PI * radius;
    }
}