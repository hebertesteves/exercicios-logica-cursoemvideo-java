import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Idade: %d anos%n", idade);

        if (idade < 18) {
            int anosFaltam = 18 - idade;
            System.out.printf("Faltam %d anos para o alistamento.%n", anosFaltam);
        } else {
            int anosPassaram = idade - 18;
            System.out.printf("Passaram %d anos do alistamento.%n", anosPassaram);
        }

        sc.close();
    }
}
