import java.util.Scanner;

public class Exercicio094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int quantidade = sc.nextInt();

        fibonacci(quantidade);

        sc.close();
    }

    public static void fibonacci(int quantidade) {
        int n1 = 1, n2 = 1;
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%d >> ", n1);
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.printf("FIM%n");
    }
}
