import java.util.Locale;
import java.util.Scanner;

public class Exercicio095 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double soma = somador(num1, num2);
        System.out.printf("A soma entre %.2f e %.2f é igual a %.2f%n", num1, num2, soma);

        sc.close();
    }

    public static double somador(double num1, double num2) {
        return num1 + num2;
    }
}
