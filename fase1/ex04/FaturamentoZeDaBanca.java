package fase1.ex04;
import java.util.Scanner;

public class ZeDaBanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int games, calculadoras, canetas;
        double precoGame, precoCalculadora, precoCaneta;
        double faturamentoGames, faturamentoCalculadoras, faturamentoCanetas, faturamentoTotal;

        System.out.print("Total de games vendidos: ");
        games = scanner.nextInt();
        System.out.print("Preço de cada game: ");
        precoGame = scanner.nextDouble();
        
        System.out.print("Total de calculadoras vendidas: ");
        calculadoras = scanner.nextInt();
        System.out.print("Preço de cada calculadora: ");
        precoCalculadora = scanner.nextDouble();
        
        System.out.print("Total de canetas vendidas: ");
        canetas = scanner.nextInt();
        System.out.print("Preço de cada caneta: ");
        precoCaneta = scanner.nextDouble();
        
        faturamentoGames = games * precoGame;
        faturamentoCalculadoras = calculadoras * precoCalculadora;
        faturamentoCanetas = canetas * precoCaneta;
        faturamentoTotal = faturamentoGames + faturamentoCalculadoras + faturamentoCanetas;
        
        System.out.printf("Faturamento com games: R$ %.2f%n", faturamentoGames);
        System.out.printf("Faturamento com calculadoras: R$ %.2f%n", faturamentoCalculadoras);
        System.out.printf("Faturamento com canetas: R$ %.2f%n", faturamentoCanetas);
        System.out.printf("Faturamento total: R$ %.2f%n", faturamentoTotal);
        
        scanner.close();
    }
}
