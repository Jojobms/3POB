import java.util.Scanner;

public class Impopa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, totalNumeros = 0, pares = 0, impares = 0;

        while (true) {
            System.out.print("Digite um número (ou -1 para encerrar): ");
            numero = scanner.nextInt();

            if (numero == -1) break;

            totalNumeros++;
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total de números digitados: " + totalNumeros);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
