import java.util.Random;

public class Exercicio076 {
    public static void main(String[] args) {
        int[] vetor = new int[7];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt();
            System.out.printf("%d ", vetor[i]);
        }
    }
}
