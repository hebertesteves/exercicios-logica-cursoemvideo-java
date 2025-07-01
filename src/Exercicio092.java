import java.util.Scanner;

public class Exercicio092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        parOuImpar(num);

        sc.close();
    }

    public static void parOuImpar(int n) {
        if (n % 2 == 0) {
            System.out.printf("O número %d é PAR", n);
        } else {
            System.out.printf("O número %d é IMPAR", n);
        }
    }
}
