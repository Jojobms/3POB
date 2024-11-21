package fabrica.controle;

import Heranca.dominio.Pessoafisica;
import Heranca.dominio.Pessoajuridica;

public class Controle {
    public static void main(String[] args) {
       
         PessoaFisica pf = new PessoaFisica("Barreira do vasco", "99999-9999", "123.456.789-10", "Pablo Vegetti");
         System.out.println("Pessoa Física:");
         pf.exibir();
    
         PessoaJuridica pj = new PessoaJuridica("Quintino", "66666-6666", "12.345.678/9999-69", "Sim");
         System.out.println("Pessoa Jurídica:");
         pj.exibir();
     }
 }
