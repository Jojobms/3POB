public class Soma {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 50; i++) {
            soma += i;
        }

        System.out.println("O somatório dos números de 1 a 50 é: " + soma);
    }
}
