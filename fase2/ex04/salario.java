import java.util.Scanner;

public class Salaro {
    public static void main(String[] args) {
        String nome, sexo;
        double salarioBruto, desconto, salarioLiquido;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do empregado: ");
        nome = scanner.nextLine();
        System.out.print("Digite o sexo (M/F): ");
        sexo = scanner.nextLine();
        System.out.print("Digite o salário bruto: ");
        salarioBruto = scanner.nextDouble();

        if (sexo.equalsIgnoreCase("M")) {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.03;
        }

        salarioLiquido = salarioBruto - desconto;
        System.out.println("Desconto: " + desconto);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
