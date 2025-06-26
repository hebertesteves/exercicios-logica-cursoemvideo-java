import java.util.Scanner;

public class Exercicio042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");

        sc.close();
    }
}
