import java.util.Locale;
import java.util.Scanner;

public class Exercicio027 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("Média: %.1f%n", media);

        if (media < 5.0) {
            System.out.println("REPROVADO");
        } else if (media < 7.0) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
