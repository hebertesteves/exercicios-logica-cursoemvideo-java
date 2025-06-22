import java.util.Locale;
import java.util.Scanner;

public class Exercicio015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias trabalhados no mês: ");
        int diasTrabalhados = sc.nextInt();

        double salario = diasTrabalhados * 8 * 25; // Trabalha 8h por dia e ganha R$ 25 por hora trabalhada
        System.out.printf("Sálario: R$ %.2f%n", salario);

        sc.close();
    }
}
