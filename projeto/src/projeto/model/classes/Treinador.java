package projeto.model.classes;
import projeto.model.Funcionario;
import projeto.model.interfaces.Treina;

public class Treinador extends Funcionario implements Treina {
    public Treinador(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("treinador -- { ID = " + getId() + ", Nome = " + getNome() + ", Salario = " + getSalario() + " }");
    }

    @Override
    public void ensinarTecnologia() {
        System.out.println(getNome() + "irá ensinar uma tecnologia");
    }

    @Override
    public void motivarEquipe() {
        System.out.println(getNome() + "irá motivar a equipe");
    }
}