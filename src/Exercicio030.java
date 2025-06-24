import java.util.Locale;
import java.util.Scanner;

public class Exercicio030 {
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
            String classificacao = "";
            if (l1 == l2 && l2 == l3) {
                classificacao = "EQUILÁTERO";
            } else if ((l1 == l2 && l2 != l3) || (l1 == l3 && l3 != l2) || (l2 == l3 && l2 != l1)) {
                classificacao = "ISÓSCELES";
            } else if (l1 != l2 && l2 != l3 && l3 != l1) {
                classificacao = "ESCALENO";
            }

            System.out.printf("Pode formar um triângulo %s.%n", classificacao);
        } else {
            System.out.println("Não pode formar um triângulo");
        }

        sc.close();
    }
}
