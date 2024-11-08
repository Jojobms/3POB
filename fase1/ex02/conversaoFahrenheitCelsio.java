package fase1.ex02;
import java.util.Scanner;

public class fahrenParaCelso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double fahrenheit;
        double celsius;

        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        
        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);
        
        scanner.close();
    }
}
