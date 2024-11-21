package Dominio;

import java.io.*;

public class GerenciarPacientes {
    private static final String CAMINHO_ARQUIVO = "./pacientes.txt";

    public void add(Paciente paciente) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            escritor.write(paciente.toString());
            escritor.newLine();
            System.out.println("Paciente adicionado com sucesso: " + paciente);
        } catch (IOException e) {
            System.err.println("Erro ao adicionar paciente: " + e.getMessage());
        }
    }

    public void list() {
        try (BufferedReader leitor = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            boolean encontrou = false;
            System.out.println("Lista de pacientes cadastrados:");
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    Paciente paciente = new Paciente(
                            Integer.parseInt(dados[0]),
                            Double.parseDouble(dados[1]),
                            Double.parseDouble(dados[2])
                    );
                    paciente.mostrarPaciente();
                    encontrou = true;
                }
            }
            if (!encontrou) {
                System.out.println("Nenhum paciente cadastrado.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de pacientes não encontrado.");
        } catch (IOException e) {
            System.err.println("Erro ao listar pacientes: " + e.getMessage());
        }
    }

    public void update(int numero, double novoPeso, double novaAltura) {
        File arquivoOriginal = new File(CAMINHO_ARQUIVO);
        File arquivoTemp = new File("./temp_pacientes.txt");

        boolean alterado = false;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOriginal));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoTemp))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3 && Integer.parseInt(dados[0]) == numero) {
                    Paciente pacienteAtualizado = new Paciente(numero, novoPeso, novaAltura);
                    escritor.write(pacienteAtualizado.toString());
                    alterado = true;
                } else {
                    escritor.write(linha);
                }
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao alterar paciente: " + e.getMessage());
        }

        if (alterado) {
            if (arquivoOriginal.delete() && arquivoTemp.renameTo(arquivoOriginal)) {
                System.out.println("Paciente alterado com sucesso.");
            } else {
                System.err.println("Erro ao salvar as alterações.");
            }
        } else {
            System.out.println("Paciente de número " + numero + " não encontrado.");
            arquivoTemp.delete();
        }
    }

    public void delete(int numero) {
        File arquivoOriginal = new File(CAMINHO_ARQUIVO);
        File arquivoTemp = new File("./temp_pacientes.txt");

        boolean removido = false;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOriginal));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoTemp))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3 && Integer.parseInt(dados[0]) == numero) {
                    removido = true;
                } else {
                    escritor.write(linha);
                    escritor.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao excluir paciente: " + e.getMessage());
        }

        if (removido) {
            if (arquivoOriginal.delete() && arquivoTemp.renameTo(arquivoOriginal)) {
                System.out.println("Paciente removido com sucesso.");
            } else {
                System.err.println("Erro ao salvar as alterações.");
            }
        } else {
            System.out.println("Paciente de número " + numero + " não encontrado.");
            arquivoTemp.delete();
        }
    }
}
