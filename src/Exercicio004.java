import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro valor: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.printf("A soma entre %d e %d é igual a %d.%n", n1, n2, soma);

        sc.close();
    }
}
