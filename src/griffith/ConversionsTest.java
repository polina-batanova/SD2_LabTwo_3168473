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
    @Test
    void testDollarToEuro() {
        // Testing method with positive values
        assertEquals(10, conversions.dollarToEuro(11), 0.01);
        // Testing method with zero values
        assertEquals(0, conversions.dollarToEuro(0), 0.01);
        // Testing method with negative values
        assertEquals(-25, conversions.dollarToEuro(-27.5), 0.01);
    }
    @Test
    void testStringToInteger() {
        // Testing method with positive values
        assertEquals(8, conversions.stringToInteger("8"));
        // Testing method with negative values
        assertEquals(-3, conversions.stringToInteger("-3"));
        // Testing method with zero values
        assertEquals(0, conversions.stringToInteger("0"));
    }

}
