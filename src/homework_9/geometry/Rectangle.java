package homework_9.geometry;

public class Rectangle extends Figure{
    String nameFigure = "Прямоугольник";
    private double width;  // Задаем ширину
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
    @Override
    public double getSquare() {
        return width * height;
    }
    @Override
    public String getName() {
        return nameFigure;
    }
}
