package projeto;

import projeto.view.FuncionarioView;


public class Main {
    public static void main(String[] args) {
        System.out.println("\nCarregando...");
        FuncionarioView view = new FuncionarioView();
        view.menu();
        System.out.println("\nDesligando, não desligue seu computador");
    }
}