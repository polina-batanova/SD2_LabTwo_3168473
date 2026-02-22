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
    // Method for converting String to Integer
    public int stringToInteger(String val) {
        return Integer.parseInt(val);
    }
    // Method for converting Integer to String
    public String integerToString(int val) {
        return Integer.toString(val);
    }

    public String switchCase(String input) {
        String result = "";
        return null;
    }
}
