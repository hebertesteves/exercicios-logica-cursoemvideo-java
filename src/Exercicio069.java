import java.util.Scanner;

public class Exercicio069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro termo: ");
        int a1 = sc.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = sc.nextInt();

        System.out.printf("Sequência: %d ", a1);
        int soma = a1;
        int proximo = a1 + razao;
        for (int i = 0; i < 9; i++) {
            soma += proximo;
            System.out.printf("%d ", proximo);
            proximo += razao;
        }

        System.out.println();
        System.out.println("A soma dos 10 primeiros elementos da PA é: " + soma);

        sc.close();
    }
}
