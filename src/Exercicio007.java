import java.util.Locale;
import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        double dobro = num * 2;
        double tercaParte = num / 3;

        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + tercaParte);

        sc.close();
    }
}
