import java.util.Scanner;

public class Massa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double massaInicial, massa;
        int tempo = 0;

        System.out.print("Digite a massa inicial (em gramas): ");
        massaInicial = scanner.nextDouble();
        massa = massaInicial;

        while (massa >= 0.5) {
            massa /= 2;
            tempo += 50;
        }

        System.out.println("Massa final: " + massa + " gramas");
        System.out.println("Tempo necessário: " + tempo + " segundos");
    }
}
