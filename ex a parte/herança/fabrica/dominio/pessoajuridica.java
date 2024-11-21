package fabrica.dominio;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    
    public PessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) {
        super(endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    
    @Override
    public void exibir() {
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

}
