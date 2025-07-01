import java.util.Locale;
import java.util.Scanner;

public class Exercicio091 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        maior(num1, num2);

        sc.close();
    }

    public static void maior(double num1, double num2) {
        if (num1 > num2) {
            System.out.printf("O primeiro número %.2f é maior que o segundo número %.2f%n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O segundo número %.2f é maior que o primeiro número %.2f%n", num2, num1);
        } else {
            System.out.printf("O primeiro número %.2f é igual o segundo número %.2f%n", num1, num2);
        }
    }
}
