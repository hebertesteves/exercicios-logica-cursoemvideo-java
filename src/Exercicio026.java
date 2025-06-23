import java.util.Scanner;

public class Exercicio026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (num2 > num1) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os dois números são iguais");
        }

        sc.close();
    }
}
