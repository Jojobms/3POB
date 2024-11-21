package empresa.dominio;

public abstract class Funcionario {
    protected String matricula;
    protected String cpf;
    protected String nome;
    protected float salario;

   
    public Funcionario(String matricula, String cpf, String nome, float salario) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }
    public abstract void exibir();
}
