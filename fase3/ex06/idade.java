import java.util.Scanner;

public class Idademaimen18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0, menores18 = 0, maioresOuIguais18 = 0;
        int idade;

        while (true) {
            System.out.print("Digite a idade (ou -1 para encerrar): ");
            idade = scanner.nextInt();

            if (idade == -1) break;

            totalPessoas++;
            if (idade < 18) {
                menores18++;
            } else {
                maioresOuIguais18++;
            }
        }

        if (totalPessoas > 0) {
            double percMenores18 = (double) menores18 / totalPessoas * 100;
            double percMaioresOuIguais18 = (double) maioresOuIguais18 / totalPessoas * 100;

            System.out.println("Total de pessoas: " + totalPessoas);
            System.out.println("Porcentagem de menores de 18 anos: " + percMenores18 + "%");
            System.out.println("Porcentagem de 18 anos ou mais: " + percMaioresOuIguais18 + "%");
        }
    }
}
