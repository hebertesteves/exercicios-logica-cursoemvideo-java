import java.util.Locale;
import java.util.Scanner;

public class Exercicio096 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = calcularMedia(nota1, nota2);
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }
}
