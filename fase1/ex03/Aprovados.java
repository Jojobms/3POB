package fase1.ex03;
import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigo, masculino, feminino, aprovados, totalAlunos, reprovados;
        double percMasculino, percFeminino, percReprovados;

        System.out.print("Informe o código da turma: ");
        codigo = scanner.nextInt();
        System.out.print("Informe a quantidade de alunos do sexo masculino: ");
        masculino = scanner.nextInt();
        System.out.print("Informe a quantidade de alunos do sexo feminino: ");
        feminino = scanner.nextInt();
        System.out.print("Informe a quantidade de alunos aprovados: ");
        aprovados = scanner.nextInt();
        
        totalAlunos = masculino + feminino;
        reprovados = totalAlunos - aprovados;
        
        percMasculino = (double) masculino / totalAlunos * 100;
        percFeminino = (double) feminino / totalAlunos * 100;
        percReprovados = (double) reprovados / totalAlunos * 100;
        
        System.out.printf("Total de alunos: %d%n", totalAlunos);
        System.out.printf("Porcentagem de alunos do sexo masculino: %.2f%%%n", percMasculino);
        System.out.printf("Porcentagem de alunos do sexo feminino: %.2f%%%n", percFeminino);
        System.out.printf("Porcentagem de alunos reprovados: %.2f%%%n", percReprovados);
        
        scanner.close();
    }
}
