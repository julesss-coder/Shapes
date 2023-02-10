public class Circle extends Shape {
    private double radius;

// Check for radius <= 0 goes into the constructor,
// as it should not be possible to make a circle with a radius <= 0.
    public Circle(String color, Boolean isFilled, double radius) {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius needs to be > 0.");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
