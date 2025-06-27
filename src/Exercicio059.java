import java.util.Locale;
import java.util.Scanner;

public class Exercicio059 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean mulherRegistrada = false;
        int maiorIdade = 0;
        int quantidadeHomens = 0;
        int menorIdadeMulher = 0;
        int somaIdadeHomens = 0;

        while (true) {
            System.out.print("Digite o sexo de uma pessoa (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Digite a idade de uma pessoa: ");
            int idade = sc.nextInt();

            if (sexo == 'M') {
                quantidadeHomens++;
                somaIdadeHomens += idade;
            } else if (sexo == 'F') {
                if (!mulherRegistrada) {
                    menorIdadeMulher = idade;
                    mulherRegistrada = true;
                } else if (idade < menorIdadeMulher) {
                    menorIdadeMulher = idade;
                }
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            System.out.print("Deseja continuar (s/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);

            if (resp == 'n') {
                break;
            }
        }

        double mediaIdadeHomens = (double) somaIdadeHomens / quantidadeHomens;

        System.out.printf("A maior idade lida é: %d%n", maiorIdade);
        System.out.printf("A quantidade de homens cadastrados é: %d%n", quantidadeHomens);
        System.out.printf("A menor idade lida de uma mulher é: %d%n", menorIdadeMulher);
        System.out.printf("A média de idade entre os homens é: %.2f%n", mediaIdadeHomens);

        sc.close();
    }
}
