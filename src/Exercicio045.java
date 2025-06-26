import java.util.Scanner;

public class Exercicio045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro Valor: ");
        int primeiroValor = sc.nextInt();

        System.out.print("Digite o último Valor: ");
        int ultimoValor = sc.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        if (primeiroValor < ultimoValor) {
            for (int i = primeiroValor; i <= ultimoValor; i += incremento) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = primeiroValor; i >= ultimoValor; i -= incremento) {
                System.out.print(i + " ");
            }
        }
        System.out.print("Acabou!");

        sc.close();
    }
}
