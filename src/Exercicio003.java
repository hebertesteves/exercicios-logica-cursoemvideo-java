import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.printf("O funcionário %s tem um salário de R$%.2f em Junho.%n", nome, salario);

        sc.close();
    }
}
