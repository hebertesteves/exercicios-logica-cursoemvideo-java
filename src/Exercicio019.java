import java.util.Locale;
import java.util.Scanner;

public class Exercicio019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7.0) {
            System.out.printf("%s teve um bom aproveitamento!", nome);
        } else {
            System.out.printf("%s não teve um bom aproveitamento!", nome);
        }

        sc.close();
    }
}
