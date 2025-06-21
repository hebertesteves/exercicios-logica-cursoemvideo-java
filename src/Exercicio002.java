import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome?");
        String nome = sc.nextLine();
        System.out.printf("Olá %s, é um prazer te conhecer!%n", nome);

        sc.close();
    }
}
