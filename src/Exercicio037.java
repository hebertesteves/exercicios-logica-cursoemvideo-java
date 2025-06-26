import java.util.Locale;
import java.util.Scanner;

public class Exercicio037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu gênero (M/F): ");
        char genero = sc.nextLine().toUpperCase().charAt(0);

        System.out.print("Digite o seu salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite a quantos anos trabalha na empresa: ");
        int anosTrabalho = sc.nextInt();

        int aumento = 0;
        if (genero == 'F') {
            if (anosTrabalho < 15) {
                aumento = 5;
            } else if (anosTrabalho <= 20) {
                aumento = 12;
            } else {
                aumento = 23;
            }
        } else if (genero == 'M') {
            if (anosTrabalho < 20) {
                aumento = 3;
            } else if (anosTrabalho <= 30) {
                aumento = 13;
            } else {
                aumento = 25;
            }
        }

        double novoSalario = ((100 + aumento) * salario) / 100;
        System.out.printf("Salário Novo: R$ %.2f%n", novoSalario);

        sc.close();
    }
}
