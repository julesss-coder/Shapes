import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    private Shape rectangle;

    @BeforeEach
    void exceptionSetUp() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle("pink", true, 5.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle("pink", true, 0, 5.0));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle("pink", true, -10.0, -10.0));
        assertEquals("Length and width must be > 0.", exception.getMessage());
    }

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle("pink", true, 5.0, 10.0);
    }

    @Test
    void getAreaTest() {
        Shape rectangle = new Rectangle("pink", true, 5.0, 10.0);
        assertEquals(50, rectangle.getArea());

        rectangle = new Rectangle("pink", true, 22.22, 4.58);
        assertEquals(101.7676, rectangle.getArea());
    }
    
    @Test
    void getPerimeterTest() {
        Shape rectangle = new Rectangle("pink", true, 5.0, 10.0);
        assertEquals(30, rectangle.getPerimeter());

        rectangle = new Rectangle("pink", true, 5.2, 10.53);
        assertEquals(31.46, rectangle.getPerimeter());
    }
}
