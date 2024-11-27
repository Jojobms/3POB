package projeto.model.classes;
import projeto.model.Funcionario;
import projeto.model.interfaces.Gerencia;

public class Gerente extends Funcionario implements Gerencia {
    public Gerente(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente -- { ID = " + getId() + ", Nome = " + getNome() + ", Salário = " + getSalario() + " }");
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " vai organizar la equipe");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " irá conduzir reuniões.");
    }
}