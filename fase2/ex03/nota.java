package fase2.ex03;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String nome;
        double nota1, nota2, media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if (media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
