import java.util.Locale;
import java.util.Scanner;

public class Exercicio060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadePessoas = 0;
        int quantidadeMulheres = 0;
        int maiorIdade = 0;
        int menorIdadeMulher = 0;
        String nomeMaisVelho = "";
        String nomeMulherMaisNova = "";
        int somaIdade = 0;
        int quantidadeHomensMais30 = 0;
        int quantidadeMulheresMenos18 = 0;

        while (true) {
            System.out.printf("Digite o nome da %d° pessoa: ", quantidadePessoas + 1);
            String nome = sc.nextLine();

            System.out.printf("Digite a idade da %d° pessoa: ", quantidadePessoas + 1);
            int idade = sc.nextInt();

            System.out.printf("Digite o sexo da %d° pessoa (M/F): ", quantidadePessoas + 1);
            char sexo = sc.next().toUpperCase().charAt(0);

            if (quantidadePessoas == 0) {
                maiorIdade = idade;
                nomeMaisVelho = nome;
            } else if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelho = nome;
            }

            if (sexo == 'F') {
                if (quantidadeMulheres == 0) {
                    menorIdadeMulher = idade;
                    nomeMulherMaisNova = nome;
                } else if (idade < menorIdadeMulher) {
                    menorIdadeMulher = idade;
                    nomeMulherMaisNova = nome;
                }

                if (idade < 18) {
                    quantidadeMulheresMenos18++;
                }

                quantidadeMulheres++;
            } else if (sexo == 'M') {
                if (idade > 30) {
                    quantidadeHomensMais30++;
                }
            }

            somaIdade += idade;
            quantidadePessoas++;

            System.out.print("Deseja continuar (s/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            if (resp == 'n') {
                break;
            }
        }

        double mediaIdade = (double) somaIdade / quantidadePessoas;

        System.out.printf("O nome da pessoa mais velha é: %s%n", nomeMaisVelho);
        System.out.printf("O nome da mulher mais jovem é: %s%n", nomeMulherMaisNova);
        System.out.printf("A média de idade do grupo é: %.2f%n", mediaIdade);
        System.out.printf("A quantidade de homens mais de 30 anos é: %d%n", quantidadeHomensMais30);
        System.out.printf("A quantidade de mulheres menos de 18 anos é: %d%n", quantidadeMulheresMenos18);

        sc.close();
    }
}
