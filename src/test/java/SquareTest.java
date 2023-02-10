import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    private Shape square;

    @BeforeEach
    void exceptionSetUp() {
        assertThrows(IllegalArgumentException.class, () -> new Square("pink", true, 0.0));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Square("pink", true, -10.0));
        assertEquals("Length and width must be > 0.", exception.getMessage());
    }

    @BeforeEach
    void setUp() {
        square = new Square("pink", true, 5.0);
    }

    @Test
    void getAreaTest() {
        Shape square = new Square("pink", true, 5.0);
        assertEquals(25, square.getArea());

        square = new Square("pink", true, 22.20);
        assertEquals(492.84, square.getArea());
    }

    @Test
    void getPerimeterTest() {
        Shape square = new Square("pink", true, 5.0);
        assertEquals(20, square.getPerimeter());

        square = new Square("pink", true, 10.53);
        assertEquals(42.12, square.getPerimeter());
    }
}
