import java.util.Scanner;

public class Maiorde3 {
    public static void main(String[] args) {
        int num1, num2, num3, maior;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }

        if (maior < num3) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
