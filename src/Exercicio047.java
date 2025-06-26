public class Exercicio047 {
    public static void main(String[] args) {
        int i = 500;
        int soma = 0;

        while (i >= 0) {
            soma += i;
            i -= 50;
        }

        System.out.printf("A soma dos números de 500 até 0, de 50 em 50, é: %d%n", soma);
    }
}
