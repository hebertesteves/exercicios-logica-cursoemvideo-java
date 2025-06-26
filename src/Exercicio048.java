import java.util.Scanner;

public class Exercicio048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 7) {
            System.out.printf("Digite o %d° numero: ", i + 1);
            int num = sc.nextInt();
            soma += num;
            i++;
        }

        System.out.printf("A soma entre os 7 números são: %d%n", soma);

        sc.close();
    }
}
