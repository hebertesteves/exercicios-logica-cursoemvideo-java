import java.util.Locale;
import java.util.Scanner;

public class Exercicio023 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Digite o valor das compras: R$ ");
        double valorCompra = sc.nextDouble();

        int cupom = 0;
        if (sexo == 'M') {
            cupom = 5; // 5% de desconto
        } else if (sexo == 'F') {
            cupom = 13; // 13% de desconto
        }

        double valorFinal = ((100 - cupom) * valorCompra) / 100;
        System.out.printf("%s o valor da compra com desconto: R$ %.2f%n", nome, valorFinal);

        sc.close();
    }
}
