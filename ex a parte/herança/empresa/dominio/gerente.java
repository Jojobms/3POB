package empresa.dominio;

public class Gerente extends Funcionario {
    private float gratificacao;

    public Gerente(String matricula, String cpf, String nome, float salario, float gratificacao) {
        super(matricula, cpf, nome, salario);
        this.gratificacao = gratificacao;
    }
  
    @Override
    public void exibir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Gratificação: R$ " + gratficacao);
    }
}
