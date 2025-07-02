import java.util.Locale;
import java.util.Scanner;

public class Exercicio097 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        double maior = verificarMaior(num1, num2, num3);
        System.out.printf("Maior número é: %.2f%n", maior);

        sc.close();
    }

    public static double verificarMaior(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
