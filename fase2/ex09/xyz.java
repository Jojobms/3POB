import java.util.Scanner;

public class Xyz {
    public static void main(String[] args) {
        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        x = scanner.nextDouble();
        System.out.print("Digite o valor de Y: ");
        y = scanner.nextDouble();
        System.out.print("Digite o valor de Z: ");
        z = scanner.nextDouble();

        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo equilátero");
            } else if (x == y || y == z || x == z) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }
    }
}
