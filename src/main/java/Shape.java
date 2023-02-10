abstract public class Shape {
    String color;
    Boolean isFilled;

    Shape(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
