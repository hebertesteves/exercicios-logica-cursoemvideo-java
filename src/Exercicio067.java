import java.util.Scanner;

public class Exercicio067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.print("Contagem: ");
        for (int i = 0; i <= num; i++) {
            System.out.print(i + ", ");
        }
        System.out.print("FIM!");

        sc.close();
    }
}
