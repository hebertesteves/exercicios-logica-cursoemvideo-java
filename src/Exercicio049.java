import java.util.Scanner;

public class Exercicio049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int contPar = 0;
        int contImpar = 0;

        while (i < 6) {
            System.out.printf("Digite o %d° numero: ", i + 1);
            int num = sc.nextInt();
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            i++;
        }

        System.out.printf("A quantidade de pares é: %d%n", contPar);
        System.out.printf("A quantidade de ímpares é: %d%n", contImpar);

        sc.close();
    }
}
