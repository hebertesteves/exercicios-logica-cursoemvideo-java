public class Exercicio046 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 6; i <= 100; i += 2) {
            soma += i;
        }
        System.out.printf("A soma dos números de 6 até 100, de 2 em 2, é: %d%n", soma);
    }
}
