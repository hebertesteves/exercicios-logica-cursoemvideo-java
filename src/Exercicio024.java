import java.util.Locale;
import java.util.Scanner;

public class Exercicio024 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em km que quer percorrer: ");
        double distancia = sc.nextDouble();

        double precoPorKm = 0;
        if (distancia <= 200) {
            precoPorKm = 0.50; // R$0.50 por Km até viagens de 200Km
        } else {
            precoPorKm = 0.45; // R$0.45 por Km em viagens mais longas
        }

        double precoPassagem = distancia * precoPorKm;
        System.out.printf("Preço da Passagem: R$ %.2f%n", precoPassagem);
        sc.close();
    }
}
