import java.util.Locale;
import java.util.Scanner;

public class Exercicio052 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int soma = 0;
        int contMais18 = 0;
        int contMenos5 = 0;
        int maiorIdade = 0;

        while (i < 10) {
            System.out.printf("Digite a idade da %d° pessoa: ", i + 1);
            int idade = sc.nextInt();

            if (idade > 18) {
                contMais18++;
            } else if (idade < 5) {
                contMenos5++;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            soma += idade;
            i++;
        }

        double media = soma / 10.0;

        System.out.printf("A média de idade do grupo é: %.2f%n", media);
        System.out.printf("A quantidade de pessoas maiores de 18 anos é: %d%n", contMais18);
        System.out.printf("A quantidade de pessoas menores de 5 anos é: %d%n", contMenos5);
        System.out.printf("A maior idade é: %d%n", maiorIdade);

        sc.close();
    }
}
