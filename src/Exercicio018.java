import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Idade: %d anos%n", idade);

        if (idade < 16) {
            System.out.println("Não pode1 votar");
        } else if (idade < 18) {
            System.out.println("Voto Opcional");
        } else if (idade < 70) {
            System.out.println("Voto obrigatorio");
        } else {
            System.out.println("Voto Opcional");
        }

        sc.close();
    }
}
