public class Exercicio070 {
    public static void main(String[] args) {
        int quantidade = 10;
        int n1 = 1;
        int n2 = 1;

        System.out.printf("Os %d primeiros elementos da Sequência de Fibonacci: ", quantidade);
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%d ", n1);
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
}
