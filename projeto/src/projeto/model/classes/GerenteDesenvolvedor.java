package projeto.model.classes;

import projeto.model.Funcionario;
import projeto.model.interfaces.Desenvolve;
import projeto.model.interfaces.Gerencia;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {
    public GerenteDesenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente Desenvolvedor -- { ID = " + getId() + ", Nome = " + getNome() + ", Salário = " + getSalario() + " }");
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " vai organizar a equipe");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " vai conduzir reuniões.");
    }

    @Override
    public void codar() {
        System.out.println(getNome() + " começou a codar");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " irá resolver problemas");
    }
}