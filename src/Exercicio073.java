public class Exercicio073 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor.length - 1 - i;
            System.out.printf("%d ", vetor[i]);
        }
    }
}
