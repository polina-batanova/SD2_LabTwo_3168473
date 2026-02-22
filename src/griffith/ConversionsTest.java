package griffith;
// Polina Batanova 3168473

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
    @Test
    void testIntegerToString() {
        // Testing method with positive values
        assertEquals("23", conversions.integerToString(23));
        // Testing method with negative values
        assertEquals("-100", conversions.integerToString(-100));
        // Testing method with zero values
        assertEquals("0", conversions.integerToString(0));
    }
    @Test
    void testSwitchCase() {
        // Testing all lowercase to uppercase
        assertEquals("TRAVEL", conversions.switchCase("travel"));
        // Testing capitalized word to first letter lower, rest upper
        assertEquals("pARIS", conversions.switchCase("Paris"));
        // Testing mixed case word
        assertEquals("gUINNESS", conversions.switchCase("Guinness"));
    }

}
