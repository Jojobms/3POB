import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, maior = -1000;

        while (true) {
            System.out.print("Digite um número (ou -1 para encerrar): ");
            numero = scanner.nextInt();

            if (numero == -1) break;

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
}
