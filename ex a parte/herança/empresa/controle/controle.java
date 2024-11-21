package empresa.controle;

import heranca.empresa.Gerente;
import heranca.empresa.Vendas;

public class Controle {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("2222", "123.456.789-99", "Vasco da Gama", 10000, 2000);
        System.out.println("gerente:");
        gerente.exibir();

        Vendas vendedor = new Vendas("777", "200.300.400-55", "vendedor", 1420,2);
        System.out.println("vendedor:");
        vendedor.exibir();
    }
}
