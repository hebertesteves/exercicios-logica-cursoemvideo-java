import java.util.Scanner;

public class Exercicio079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("O número %d é PAR e está na posição %d%n", numeros[i], i);
            } else {
                System.out.printf("O número %d é IMPAR e está na posição %d%n", numeros[i], i);
            }
        }


        sc.close();
    }
}
