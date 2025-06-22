import java.util.Locale;
import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de km percorrido: ");
        double distanciaPercorrida = sc.nextDouble();

        System.out.print("Digite a quantidade de dias o carro foi alugado: ");
        int diasAlugado = sc.nextInt();

        double custoDiarias = 90 * diasAlugado; // Custa R$ 90 por dia
        double custoKm = 0.20 * distanciaPercorrida; // Custa R$ 0,20 por Km rodado
        double precoTotal = custoDiarias + custoKm; // Valor total a pagar

        System.out.printf("Custo por diárias: R$ %.2f%n", custoDiarias);
        System.out.printf("Custo por km rodado: R$ %.2f%n", custoKm);
        System.out.printf("Valor total a pagar: R$ %.2f%n", precoTotal);

        sc.close();
    }
}
