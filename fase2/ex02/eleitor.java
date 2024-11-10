package fase2.ex02;
import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = scanner.nextInt();

        idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else {
            System.out.println("É eleitor");
        }
    }
}
