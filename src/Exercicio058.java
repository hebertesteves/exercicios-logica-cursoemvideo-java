import java.util.Locale;
import java.util.Scanner;

public class Exercicio058 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int somaIdade = 0;
        int quantidadeAlunos = 0;

        while (true) {
            System.out.printf("Digite a idade do %d° aluno: ", quantidadeAlunos + 1);
            int idade = sc.nextInt();

            if (idade == 999) {
                break;
            }

            somaIdade += idade;
            quantidadeAlunos++;
        }

        double media = (double) somaIdade / quantidadeAlunos;

        System.out.printf("A quantidade de alunos na turma é: %d%n", quantidadeAlunos);
        System.out.printf("A média de idade do grupo é: %.2f%n", media);

        sc.close();
    }
}
