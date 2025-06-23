import java.util.Locale;
import java.util.Scanner;

public class Exercicio025 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double l1 = sc.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double l2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double l3 = sc.nextDouble();

        if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2)){
            System.out.println("Pode formar um triângulo");
        } else {
            System.out.println("Não pode formar um triângulo");
        }

        sc.close();
    }
}
