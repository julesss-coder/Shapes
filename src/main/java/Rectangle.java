public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, Boolean isFilled, double width, double length) {
        super(color, isFilled);
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Length and width must be > 0.");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
