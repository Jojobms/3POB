package Controle;

import Dominio.Paciente;
import Dominio.GerenciarPacientes;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        GerenciarPacientes gerenciador = new GerenciarPacientes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Alterar Paciente");
            System.out.println("4. Remover Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
                continue;
            }

            if (opcao == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o Número: ");
                    int numero = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite o Peso: ");
                    double peso = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite a Altura: ");
                    double altura = Double.parseDouble(scanner.nextLine());
                    gerenciador.add(new Paciente(numero, peso, altura));
                }
                case 2 -> gerenciador.list();
                case 3 -> {
                    System.out.print("Digite o Número do paciente para alterar: ");
                    int numeroAlterar = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite o novo Peso: ");
                    double novoPeso = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite a nova Altura: ");
                    double novaAltura = Double.parseDouble(scanner.nextLine());
                    gerenciador.update(numeroAlterar, novoPeso, novaAltura);
                }
                case 4 -> {
                    System.out.print("Digite o Número do paciente para remover: ");
                    int numeroRemover = Integer.parseInt(scanner.nextLine());
                    gerenciador.delete(numeroRemover);
                }
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
