import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.printf("O antecessor de %d é %d%n", num, antecessor);
        System.out.printf("O sucessor de %d é %d%n", num, sucessor);

        sc.close();
    }
}
