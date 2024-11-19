package dominio;

import java.util.ArrayList;
import java.util.List;

public class gerepacient {
    private List<Paciente> pacientes;

    public gerepacient() {
        this.pacientes = new ArrayList<>();
    }

    public void incpaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente incluído com sucesso.");
    }

    public void listallpacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de pacientes:");
            for (Paciente p : pacientes) {
                p.mostrarPaciente();
            }
        }
    }

    public void altpaciente(int numero, double novoPeso, double novaAltura) {
        for (Paciente p : pacientes) {
            if (p.getNumero() == numero) {
                p.setPeso(novoPeso);
                p.setAltura(novaAltura);
                System.out.println("Paciente alterado com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void exclpaciente(int numero) {
        for (Paciente p : pacientes) {
            if (p.getNumero() == numero) {
                pacientes.remove(p);
                System.out.println("Paciente removido com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void verpaciente(int numero) {
        for (Paciente p : pacientes) {
            if (p.getNumero() == numero) {
                System.out.println("Paciente encontrado:");
                p.mostrarPaciente();
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }
}
