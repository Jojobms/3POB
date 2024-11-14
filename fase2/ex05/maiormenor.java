import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        int numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
