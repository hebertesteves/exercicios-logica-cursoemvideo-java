public class Exercicio075 {
    public static void main(String[] args) {
        int[] vetor = new int[16];
        int n1 = 1, n2 = 1;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = n1;
            System.out.printf("%d ", vetor[i]);
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
}
