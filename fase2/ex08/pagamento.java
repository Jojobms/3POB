import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        int codigo, quantidade, formaPagamento;
        double precoUnitario, desconto, valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        codigo = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário: ");
        precoUnitario = scanner.nextDouble();
        System.out.print("Digite a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito): ");
        formaPagamento = scanner.nextInt();

        double valorTotal = quantidade * precoUnitario;

        switch (formaPagamento) {
            case 1 -> desconto = valorTotal * 0.10;
            case 3 -> desconto = valorTotal * 0.05;
            case 4 -> desconto = valorTotal * 0.03;
            case 2 -> desconto = valorTotal * 0.02;
            default -> desconto = 0;
        }

        valorFinal = valorTotal - desconto;
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor final a pagar: " + valorFinal);
    }
}
