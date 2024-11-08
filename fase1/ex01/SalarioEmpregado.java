package fase1.ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int matricula1, matricula2;
        double salario1, salario2;
        double desconto1, aumento2;
        double salarioFinal1, salarioFinal2;

        System.out.print("Informe a matrícula do primeiro empregado: ");
        matricula1 = scanner.nextInt();
        System.out.print("Informe o salário do primeiro empregado: ");
        salario1 = scanner.nextDouble();
        
        System.out.print("Informe a matrícula do segundo empregado: ");
        matricula2 = scanner.nextInt();
        System.out.print("Informe o salário do segundo empregado: ");
        salario2 = scanner.nextDouble();
        
        desconto1 = salario1 * 0.05;
        aumento2 = salario2 * 0.09;
        salarioFinal1 = salario1 - desconto1;
        salarioFinal2 = salario2 + aumento2;
        
        System.out.printf("Desconto do primeiro empregado: R$ %.2f%n", desconto1);
        System.out.printf("Acréscimo do segundo empregado: R$ %.2f%n", aumento2);
        System.out.printf("Salário final do primeiro empregado: R$ %.2f%n", salarioFinal1);
        System.out.printf("Salário final do segundo empregado: R$ %.2f%n", salarioFinal2);
        
        scanner.close();
    }
}
