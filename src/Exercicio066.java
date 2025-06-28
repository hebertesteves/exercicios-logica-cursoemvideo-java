import java.util.Scanner;

public class Exercicio066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.printf("%d x %d = %d%n", num, i, resultado);
        }

        sc.close();
    }
}
