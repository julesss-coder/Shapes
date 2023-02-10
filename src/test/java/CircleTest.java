import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {
    // FIXME "Private field 'circle' is assigned but never accessed": Why? `circle` is re-assigned inside the test methods.
    // FIXME Is this declaration even necessary?
    private Shape circle;

    // FIXME Can I have two @BeforeEach tests, one for the regular set up, one for the exception with an invalid radius?
    @BeforeEach // APPEARS TO WORK
    void exceptionSetUp() {
        assertThrows(IllegalArgumentException.class, () -> new Circle("red", true, 0.0));
    }

    @BeforeEach // APPEARS TO WORK
    void setUp() {
        circle = new Circle("red", true, 2.0);
    }

    @Test  // APPEARS TO WORK
    void getAreaTest() {
        circle = new Circle("blue", false, 5.0);
        assertEquals(Math.PI * 25, circle.getArea());

        circle = new Circle("blue", false, 5.3);
        assertEquals(Math.PI * 28.09, circle.getArea());
    }

    @Test // APPEARS TO WORK
    void getPerimeterTest() {
        // FIXME Do I need to create a new test object within each test method, or is it okay to reassign the instance variable `circle`
        circle = new Circle("blue", false, 5.0);
        assertEquals(2 * 5.0 * Math.PI, circle.getPerimeter());
        circle = new Circle("blue", false, 5.5);
        assertEquals(2 * 5.5 * Math.PI, circle.getPerimeter());
    }
}
