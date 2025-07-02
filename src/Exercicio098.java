import java.util.Scanner;

public class Exercicio098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();

        int soma = superContador(n1, n2);
        System.out.printf("A soma do Super Contador de %d ate %d é %d%n", n1, n2, soma);

        sc.close();
    }

    public static int superContador(int n1, int n2) {
        int soma = 0;
        for (int i = n1; i <= n2; i++) {
            soma += i;
        }

        return soma;
    }
}
