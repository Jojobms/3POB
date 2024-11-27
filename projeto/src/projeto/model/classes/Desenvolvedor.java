package projeto.model.classes;
import projeto.model.Funcionario;
import projeto.model.interfaces.Desenvolve;

public class Desenvolvedor extends Funcionario implements Desenvolve {
    public Desenvolvedor(int id, String nome, double salario) {

        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Desenvolvedor -- { ID = " + getId() + ", Nome = " + getNome() + ", Salário = " + getSalario() + " }");
    }

    @Override
    public void codar() {
        System.out.println(getNome() + " começou a codar.");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " irá resolver problemas.");
    }
}