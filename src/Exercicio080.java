import java.util.Random;
import java.util.Scanner;

public class Exercicio080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[30];
        Random random = new Random();

        System.out.printf("Vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(15) + 1;
            System.out.printf("%d ", numeros[i]);
        }

        System.out.println();
        System.out.print("Digite uma chave: ");
        int chave = sc.nextInt();
        int quantidadeChaveEncontrada = 0;

        for (int i = 0; i < numeros.length; i++) {
             if (numeros[i] == chave) {
                 System.out.printf("A chave %d foi encontrado na posição %d%n", chave, i);
                 quantidadeChaveEncontrada++;
             }
        }

        System.out.printf("A quantidade encontrada é %d%n", quantidadeChaveEncontrada);

        sc.close();
    }
}
