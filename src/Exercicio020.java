import java.util.Scanner;

public class Exercicio020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O numero %d é PAR", numero);
        } else {
            System.out.printf("O numero %d é IMPAR", numero);
        }

        sc.close();
    }
}
