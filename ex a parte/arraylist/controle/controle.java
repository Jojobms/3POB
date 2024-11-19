package controle;

import dominio.paciente;
import dominio.funcpaci;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        GerenciarPacientes gerenciador = new GerenciarPacientes();
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        

        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Alterar Paciente");
            System.out.println("3. Excluir Paciente");
            System.out.println("4. Verificar Paciente");
            System.out.println("5. Verificar Todos os Pacientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do paciente: ");
                    int numero = scanner.nextInt();
                    System.out.print("Digite o peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    gerenciador.incluirPaciente(new Paciente(numero, peso, altura));
                    break;
                case 2:
                    System.out.print("Digite o número do paciente: ");
                    int numeroAlteracao = scanner.nextInt();
                    System.out.print("Digite o novo peso: ");
                    double pesoAlteracao = scanner.nextDouble();
                    System.out.print("Digite a nova altura: ");
                    double alturaAlteracao = scanner.nextDouble();
                    gerenciador.alterarPaciente(numeroAlteracao, pesoAlteracao, alturaAlteracao);
                    break;
                case 3:
                    System.out.print("Digite o número do paciente a ser removido: ");
                    int numeroExclusao = scanner.nextInt();
                    gerenciador.excluirPaciente(numeroExclusao);
                    break;
                case 4:
                    System.out.print("Digite o número do paciente para consultar: ");
                    int numeroConsulta = scanner.nextInt();
                    gerenciador.consultarPaciente(numeroConsulta);
                    break;
                case 5:
                    gerenciador.listarTodosPacientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
