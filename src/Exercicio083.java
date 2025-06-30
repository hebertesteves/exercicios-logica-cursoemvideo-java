import java.util.Random;

public class Exercicio083 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        // Gerando vetor de números inteiros de 0 a 99
        System.out.print("Vetor Gerado: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
            System.out.printf("%d ", numeros[i]);
        }
        System.out.println();

        // Ordenando o vetor em ordem crescente
        System.out.print("Colocando em Ordem Crescente: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[i]) {
                    int troca = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = troca;
                }
            }
        }

        // Exibindo vetor em ordem crescente
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ", numeros[i]);
        }

    }
}
