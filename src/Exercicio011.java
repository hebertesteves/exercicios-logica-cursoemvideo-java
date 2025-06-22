import java.util.Locale;
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A da equação do segundo grau: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B da equação do segundo grau: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C da equação do segundo grau: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        System.out.printf("Delta = %.2f%n", delta);

        sc.close();
    }
}
