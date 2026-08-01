package homework_9.geometry;

public class Triangle extends Figure{
    String nameFigure = "Треугольник";
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public double getSquare() {
        double perimeter = getPerimeter() / 2.0;
        return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
    }
    @Override
    public String getName() {
        return nameFigure;
    }
}
