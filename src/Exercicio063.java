import java.util.Locale;
import java.util.Scanner;

public class Exercicio063 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeNumero = 0;
        double somaNumero = 0.0;
        double menorNumero = 0.0;
        int quantidadePares = 0;

        do {
            System.out.printf("Digite o %d° número: ", quantidadeNumero + 1);
            double numero = sc.nextDouble();

            if (quantidadeNumero == 0) {
                menorNumero = numero;
            } else if (numero < menorNumero) {
                menorNumero = numero;
            }

            if (numero % 2 == 0) {
                quantidadePares++;
            }

            somaNumero += numero;
            quantidadeNumero++;

            System.out.print("Deseja continuar (s/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            if (resp == 'n') {
                break;
            }
        } while (true);

        double media = somaNumero / quantidadeNumero;

        System.out.printf("O somatório entre os números é: %.2f%n", somaNumero);
        System.out.printf("O menor número digitado é: %.2f%n", menorNumero);
        System.out.printf("A média dos números digitadas é: %.2f%n", media);
        System.out.printf("A quantidade de números pares é: %d%n", quantidadePares);

        sc.close();
    }
}
