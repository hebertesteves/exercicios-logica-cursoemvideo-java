import java.util.Locale;
import java.util.Scanner;

public class Exercicio051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double maior = 0.0;
        double menor = 0.0;

        while (i < 8) {
            System.out.printf("Digite o preço do %d° produto: R$ ", i + 1);
            double preco = sc.nextDouble();

            if (i == 0) {
                maior = preco;
                menor = preco;
            } else {
                if (preco > maior) {
                    maior = preco;
                }

                if (preco < menor) {
                    menor = preco;
                }
            }
            
            i++;
        }

        System.out.printf("O maior valor é: R$ %.2f%n", maior);
        System.out.printf("O menor valor é: R$ %.2f%n", menor);

        sc.close();
    }
}
