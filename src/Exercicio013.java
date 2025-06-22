import java.util.Locale;
import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = sc.nextDouble();

        double salarioReajustado = (salario * 115) / 100; // 15% de aumento
        System.out.printf("Sálario com 15%% de aumento: R$ %.2f%n", salarioReajustado);

        sc.close();
    }
}
