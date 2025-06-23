import java.util.Scanner;

public class Exercicio021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("É Bissexto");
        } else if (ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("É Bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        sc.close();
    }
}
