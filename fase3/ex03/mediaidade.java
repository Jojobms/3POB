import java.util.Scanner;

public class Mediaidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();
            soma += idade;
        }

        double media = soma / 10.0;
        System.out.println("A média das idades é: " + media);
    }
}
