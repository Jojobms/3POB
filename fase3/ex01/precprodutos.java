package fase3.ex01;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco;
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            preco = scanner.nextDouble();
            soma += preco;
        }

        System.out.println("O somatório dos preços é: " + soma);
    }
}
