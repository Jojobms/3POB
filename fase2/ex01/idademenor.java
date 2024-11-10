package fase2.ex01;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("É menor");
        }
    }
}
