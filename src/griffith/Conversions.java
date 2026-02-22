package griffith;

public class Conversions {

    private static final double RATE = 1.1;

    // Method for converting Euro to Dollar
    public double euroToDollar(double euro) {
        return euro * RATE;
    }
    // Method for converting Dollar to Euro
    public double dollarToEuro(double dollar) {
        return dollar / RATE;
    }

    public int stringToInteger(String val) {
        return Integer.parseInt(val);
    }
    public String integerToString(int val) {
        return null;
    }

    public String switchCase(String input) {
        return null;
    }
}
