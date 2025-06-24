import java.util.Locale;
import java.util.Scanner;

public class Exercicio033 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da casa: R$ ");
        double valorCasa = sc.nextDouble();

        System.out.print("Digite o seu sálario: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite em quantos anos vai pagar: ");
        int anosPagar = sc.nextInt();

        double prestacaoMensal = valorCasa / (anosPagar * 12);
        double limitePrestacao = salario * 0.30;

        System.out.println();
        System.out.printf("Prestação mensal: R$ %.2f%n", prestacaoMensal);
        System.out.printf("Limite permitido (30%% do salário): R$ %.2f%n%n", limitePrestacao);

        if (prestacaoMensal > limitePrestacao) {
            System.out.println("Empréstimo Negado!!");
        } else {
            System.out.println("Empréstimo Concedido!!");
        }

        sc.close();
    }
}
