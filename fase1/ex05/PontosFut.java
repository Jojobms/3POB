package fase1.ex05;
import java.util.Scanner;

public class PontosEquipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeEquipe;
        int derrotas, empates, vitorias;
        int pontosGanhos, pontosPerdidos;

        System.out.print("Nome da equipe: ");
        nomeEquipe = scanner.nextLine();
        
        System.out.print("Quantidade de derrotas: ");
        derrotas = scanner.nextInt();
        
        System.out.print("Quantidade de empates: ");
        empates = scanner.nextInt();
        
        System.out.print("Quantidade de vitórias: ");
        vitorias = scanner.nextInt();
        
        pontosGanhos = (vitorias * 3) + empates;
        pontosPerdidos = derrotas * 3;
        
        System.out.printf("Equipe %s tem %d pontos ganhos e %d pontos perdidos.%n", nomeEquipe, pontosGanhos, pontosPerdidos);
        
        scanner.close();
    }
}
