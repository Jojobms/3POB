package empresa.dominio;
public class Vendas extends Funcionario {
    private float partlucro;

    public Vendas(String matricula, String cpf, String nome, float salario, float partlucro) {
        super(matricula, cpf, nome, salario);
        this.partlucro = partlucro;
    }

    @Override
    public void exibir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Participacao nos Lucros: R$ " + partlucro);
    }
}
