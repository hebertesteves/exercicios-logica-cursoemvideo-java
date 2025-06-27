import java.util.Locale;
import java.util.Scanner;

public class Exercicio057 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double somaSalarioHomens = 0.0;
        double somaSalarioMulheres = 0.0;

        while (true) {
            System.out.print("Digite o sexo do funcionário (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Digite o salário do funcionário: R$ ");
            double salario = sc.nextDouble();

            if (sexo == 'M') {
                somaSalarioHomens += salario;
            } else if (sexo == 'F') {
                somaSalarioMulheres += salario;
            }

            System.out.print("Deseja continuar (s/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);

            if (resp == 'n') {
                break;
            }
        }

        System.out.printf("A soma dos salários dos homens é: R$ %.2f%n", somaSalarioHomens);
        System.out.printf("A soma dos salários das mulheres é: R$ %.2f%n", somaSalarioMulheres);

        sc.close();
    }
}
