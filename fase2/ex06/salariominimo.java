import java.util.Scanner;

public class Salariominimo {
    public static void main(String[] args) {
        double salarioMinimo, salarioBruto, desconto, salarioLiquido;
        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        System.out.print("Digite o nome do empregado: ");
        nome = scanner.nextLine();
        System.out.print("Digite o salário bruto: ");
        salarioBruto = scanner.nextDouble();

        if (salarioBruto < salarioMinimo) {
            desconto = salarioBruto * 0.02;
        } else if (salarioBruto == salarioMinimo) {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.08;
        }

        salarioLiquido = salarioBruto - desconto;
        System.out.println("Desconto: " + desconto);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
