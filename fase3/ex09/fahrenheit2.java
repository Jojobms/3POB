public class Fahr2 {
    public static void main(String[] args) {
        double celsius;

        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
            celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.println("Fahrenheit: " + fahrenheit + " - Celsius: " + celsius);
        }
    }
}
