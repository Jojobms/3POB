import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, nomeMaisAlto = "";
        double altura, somaAlturas = 0, maiorAltura = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nome = scanner.next();
            System.out.print("Digite a altura da pessoa " + i + ": ");
            altura = scanner.nextDouble();

            somaAlturas += altura;
            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }
        }

        double mediaAltura = somaAlturas / 10;
        System.out.println("Altura média do grupo: " + mediaAltura);
        System.out.println("Pessoa mais alta: " + nomeMaisAlto + " com altura de " + maiorAltura);
    }
}
