import java.util.Locale;
import java.util.Scanner;

public class Exercicio029 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu sálario: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite a quantos anos você trabalha aqui: ");
        int anosTrabalho = sc.nextInt();

        double aumento = 0.0;
        if (anosTrabalho < 3) {
            aumento = 3;
        } else if (anosTrabalho < 10) {
            aumento = 12.5;
        } else {
            aumento = 20;
        }

        double salarioReajustado = ((100 + aumento) * salario) / 100;
        System.out.printf("%s o seu sálario foi reajustado para R$ %.2f ", nome, salarioReajustado);

        sc.close();
    }
}
