import java.util.Locale;
import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto de dinheiro em R$ você tem na carteira: ");
        double carteiraReal = sc.nextDouble();

        double qtdeDolar = carteiraReal / 3.45; // Exercício considera US$1,00 = R$3,45
        System.out.println("Você pode comprar US$" + qtdeDolar);

        sc.close();
    }
}
