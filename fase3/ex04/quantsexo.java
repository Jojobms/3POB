import java.util.Scanner;

public class Homemmulhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdMasculino = 0, qtdFeminino = 0, totalPessoas = 0;
        String sexo;

        while (true) {
            System.out.print("Digite o sexo (M/F) ou 'Sair' para encerrar: ");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("Sair")) break;

            totalPessoas++;
            if (sexo.equalsIgnoreCase("M")) {
                qtdMasculino++;
            } else if (sexo.equalsIgnoreCase("F")) {
                qtdFeminino++;
            }
        }

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Total de homens: " + qtdMasculino);
        System.out.println("Total de mulheres: " + qtdFeminino);
    }
}
