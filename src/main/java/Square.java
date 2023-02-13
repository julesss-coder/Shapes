// Square is a direct subclass of Rectangle, as a square is a type of rectangle.
public class Square extends Rectangle {
    public Square(String color, Boolean isFilled, double width) {
        super(color, isFilled, width, width);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
