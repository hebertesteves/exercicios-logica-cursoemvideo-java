import java.util.Locale;
import java.util.Scanner;

public class Exercicio028 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        double area = largura * comprimento;
        System.out.printf("Área do terreno: %.2f m² - ", area);

        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        } else if (area <= 500) {
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO VIP");
        }

        sc.close();
    }
}
