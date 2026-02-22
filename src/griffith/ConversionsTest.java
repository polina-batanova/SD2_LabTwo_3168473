package griffith;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionsTest {
    Conversions conversions = new Conversions();

    @Test
    void testEuroToDollar() {
        // Testing method with positive values
        assertEquals(1.1, conversions.euroToDollar(1), 0.01);
        // Testing method with zero values
        assertEquals(0, conversions.euroToDollar(0), 0.01);
        // Testing method with negative values
        assertEquals(-1.1, conversions.euroToDollar(-1), 0.01);
    }

}
