public class Exercicio072 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int num = 0;

        for (int i = 0; i < vetor.length; i++) {
            num += 5;
            vetor[i] = num;
            System.out.printf("%d ", vetor[i]);
        }
    }
}
