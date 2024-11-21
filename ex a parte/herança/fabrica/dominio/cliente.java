package fabrica.dominio;

public abstract class Cliente {
    protected String endereco;
    protected String telefone;

    public Cliente(String endereco, String telefone) {
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public abstract void exibir();
}
