import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0, abaixo160 = 0, entre160e180 = 0, acima180 = 0;
        double altura;

        while (true) {
            System.out.print("Digite a altura da pessoa (ou -1 para encerrar): ");
            altura = scanner.nextDouble();

            if (altura == -1) break;

            totalPessoas++;
            if (altura < 1.60) {
                abaixo160++;
            } else if (altura <= 1.80) {
                entre160e180++;
            } else {
                acima180++;
            }
        }

        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Altura < 1,60m: " + abaixo160);
        System.out.println("Altura entre 1,60m e 1,80m: " + entre160e180);
        System.out.println("Altura > 1,80m: " + acima180);
    }
}
