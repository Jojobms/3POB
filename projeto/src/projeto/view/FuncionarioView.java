package projeto.view;

import projeto.controller.FuncionarioController;
import projeto.model.Funcionario;
import projeto.model.classes.Desenvolvedor;
import projeto.model.classes.Gerente;
import projeto.model.classes.GerenteDesenvolvedor;
import projeto.model.classes.Treinador;

import java.util.Scanner;

public class FuncionarioView {
    private final FuncionarioController controller = new FuncionarioController();
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        controller.carregarDados();
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = lerInteiro("Escolha uma opção: ");
            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> removerFuncionario();
                case 5 -> System.out.println("\nSistema encerrado.\n My final message, Goodbye...");
                default -> System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n------- Menu Principal -------");
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("2. Listar Funcionários");
        System.out.println("3. Atualizar Funcionário");
        System.out.println("4. Remover Funcionário");
        System.out.println("5. Sair");
        System.out.println("------------------------------");
    }

    private void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");
        if (controller.funcionariosVazios()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        controller.listarFuncionarios();

        int id = lerInteiro("\nDigite o ID do funcionário para executar ações (0 para voltar): ");
        if (id == 0) return;

        Funcionario funcionario = controller.getFuncionarioPorId(id);
        if (funcionario != null) {
            executarAcoesFuncionario(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void executarAcoesFuncionario(Funcionario funcionario) {
        System.out.println("\nEscolha uma ação para o funcionário:");
        String[] opcoes = funcionario instanceof Desenvolvedor ?
                new String[]{"Codar", "Resolver Problemas"} :
                funcionario instanceof Gerente ?
                        new String[]{"Organizar Equipe", "Conduzir Reuniões"} :
                        new String[]{"Ensinar Tecnologia", "Motivar Equipe"};

        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i + 1) + " - " + opcoes[i]);
        }
        System.out.println((opcoes.length + 1) + " - Receber Aumento de Salário");

        int opcao = lerInteiro("Sua escolha: ");
        if (opcao > 0 && opcao <= opcoes.length) {
            executarAcaoEspecifica(funcionario, opcoes[opcao - 1]);
        } else if (opcao == opcoes.length + 1) {
            aplicarAumento(funcionario);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private void executarAcaoEspecifica(Funcionario funcionario, String acao) {
        switch (acao) {
            case "Codar" -> ((Desenvolvedor) funcionario).codar();
            case "Resolver Problemas" -> ((Desenvolvedor) funcionario).resolverProblemas();
            case "Organizar Equipe" -> ((Gerente) funcionario).organizarEquipe();
            case "Conduzir Reuniões" -> ((Gerente) funcionario).conduzirReunioes();
            case "Ensinar Tecnologia" -> ((Treinador) funcionario).ensinarTecnologia();
            case "Motivar Equipe" -> ((Treinador) funcionario).motivarEquipe();
            default -> System.out.println("Ação não reconhecida.");
        }
    }

    private void aplicarAumento(Funcionario funcionario) {
        double aumento = lerDouble("Digite o valor do aumento: ");
        funcionario.receberAumento(aumento);
        System.out.println("Aumento aplicado. Novo salário: " + funcionario.getSalario());
    }

    private void cadastrarFuncionario() {
        System.out.println("\n--- Cadastro de Funcionário ---");
        int tipo = lerInteiro("""
                Escolha o cargo do funcionário:
                1 - Desenvolvedor
                2 - Gerente
                3 - Treinador
                4 - Gerente Desenvolvedor
                Sua escolha:
                """);

        if (tipo < 1 || tipo > 4) {
            System.out.println("Cargo inexistente.");
            return;
        }

        String nome = lerTexto("Digite o nome do funcionário: ");
        double salario = lerDouble("Digite o salário do funcionário: ");
        int id = lerInteiro("Digite o ID único do funcionário: ");

        Funcionario funcionario = switch (tipo) {
            case 1 -> new Desenvolvedor(id, nome, salario);
            case 2 -> new Gerente(id, nome, salario);
            case 3 -> new Treinador(id, nome, salario);
            case 4 -> new GerenteDesenvolvedor(id, nome, salario);
            default -> null; // Não será alcançado
        };

        controller.adicionarFuncionario(funcionario);
        System.out.println("\nFuncionário cadastrado com sucesso!");
    }

    private void atualizarFuncionario() {
        System.out.println("\n--- Atualização de Funcionário ---");
        int id = lerInteiro("Digite o ID do funcionário: ");
        String nome = lerTexto("Digite o novo nome: ");
        double salario = lerDouble("Digite o novo salário: ");

        controller.atualizarFuncionario(id, nome, salario);
        System.out.println("\nFuncionário atualizado com sucesso!");
    }

    private void removerFuncionario() {
        System.out.println("\n--- Remoção de Funcionário ---");
        int id = lerInteiro("Digite o ID do funcionário: ");
        controller.removerFuncionario(id);
    }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número decimal.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }
}
