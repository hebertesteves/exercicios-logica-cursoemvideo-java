import java.util.Locale;
import java.util.Scanner;

public class Exercicio036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas horas de atividade teve no mês: ");
        int horasAtividade = sc.nextInt();

        int pontosHora = 0;
        if (horasAtividade <= 10) {
            pontosHora = 2;
        } else if (horasAtividade <= 20) {
            pontosHora = 5;
        } else {
            pontosHora = 10;
        }

        int totalPontos = pontosHora * horasAtividade;
        System.out.printf("Total de Pontos feito no mês foi %d%n", totalPontos);

        double dinheiroGanho = totalPontos * 0.05;
        System.out.printf("Total de Dinheiro ganho foi R$ %.2f%n", dinheiroGanho);

        sc.close();
    }
}
