import java.util.Scanner;

public class Exercicio056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num == 1111) {
                break;
            }

            soma += num;
        }

        System.out.printf("O somatório entre os números é: %d%n", soma);

        sc.close();
    }
}
