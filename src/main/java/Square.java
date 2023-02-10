// Square is a direct subclass of Rectangle, as a square is a type of rectangle.
public class Square extends Rectangle {
    // No declaration of `width`, as Square inherits `width` and `length` from `Rectangle`
    // FIXME Instances of `Square` have `width` and `length` attributes, which is redundant
    // Alternative: Implement `Square` as subclass of `Shape` with `width` attribute only.

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
