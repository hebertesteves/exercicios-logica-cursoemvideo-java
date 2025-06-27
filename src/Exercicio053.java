import java.util.Locale;
import java.util.Scanner;

public class Exercicio053 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int somaIdade = 0;
        int contHomens = 0;
        int contMulheres = 0;
        int somaIdadeHomens = 0;
        int contMulheresMais20 = 0;

        while (i < 5) {
            System.out.printf("Digite a idade da %d° pessoa: ", i + 1);
            int idade = sc.nextInt();

            System.out.printf("Digite o sexo da %d° pessoa (M/F): ", i + 1);
            char sexo = sc.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                contHomens++;
                somaIdadeHomens += idade;
            } else if (sexo == 'F') {
                contMulheres++;
                if (idade > 20) {
                    contMulheresMais20++;
                }
            }

            somaIdade += idade;
            i++;
        }

        double mediaIdadeGrupo = somaIdade / 5.0;
        double mediaIdadeHomens = (double) somaIdadeHomens / contHomens;

        System.out.printf("A quantidade de homens cadastrados é: %d%n", contHomens);
        System.out.printf("A quantidade de mulheres cadastrados é: %d%n", contMulheres);
        System.out.printf("A média de idade do grupo é: %.2f%n", mediaIdadeGrupo);
        System.out.printf("A média de idade dos homens é: %.2f%n", mediaIdadeHomens);
        System.out.printf("A quantidade de mulheres maiores de 20 anos é: %d%n", contMulheresMais20);

        sc.close();
    }
}
