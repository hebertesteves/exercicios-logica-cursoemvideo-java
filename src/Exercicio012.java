import java.util.Locale;
import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        double precoPromocional = (preco * 95) / 100; // 5% de desconto
        System.out.printf("Preço com 5%% de desconto: R$ %.2f%n", precoPromocional);

        sc.close();
    }
}
