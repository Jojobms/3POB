package fabrica.dominio;


public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;


    public PessoaFisica(String endereco, String telefone, String cpf, String nome) {
        super(endereco, telefone);
        this.cpf = cpf;
        this.nome = nome;
    }


    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

}
