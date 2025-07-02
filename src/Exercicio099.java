import java.util.Locale;
import java.util.Scanner;

public class Exercicio099 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        double resultado = potencia(base, expoente);
        System.out.printf("A potência de base %d e expoente %d é %.0f%n", base, expoente, resultado);

        sc.close();
    }

    public static double potencia(int base, int expoente) {
        double resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
