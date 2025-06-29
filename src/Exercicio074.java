public class Exercicio074 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 5;
            } else {
                vetor[i] = 3;
            }

            System.out.printf("%d ", vetor[i]);
        }
    }
}
