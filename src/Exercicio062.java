import java.util.Locale;
import java.util.Scanner;

public class Exercicio062 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeIdade = 0;
        int somaIdade = 0;
        int quantidadeIdadeMais21 = 0;

        do {
            System.out.printf("Digite a idade da %d° pessoa: ", quantidadeIdade + 1);
            int idade = sc.nextInt();

            if (idade >= 21) {
                quantidadeIdadeMais21++;
            }

            somaIdade += idade;
            quantidadeIdade++;

            System.out.print("Deseja continuar (s/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            if (resp == 'n') {
                break;
            }
        } while (true);

        double mediaIdade = (double) somaIdade / quantidadeIdade;

        System.out.printf("A quantidade de idades digitadas é: %d%n", quantidadeIdade);
        System.out.printf("A média de idade digitadas é: %.2f%n", mediaIdade);
        System.out.printf("A quantidade de pessoas que tem 21 anos ou mais é: %d%n", quantidadeIdadeMais21);

        sc.close();
    }
}
