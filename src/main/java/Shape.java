abstract public class Shape {
    private String color;
    private Boolean isFilled;

    public Shape(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
