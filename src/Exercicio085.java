import java.util.Locale;
import java.util.Scanner;

public class Exercicio085 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        char[] sexos = new char[nomes.length];
        double[] salarios = new double[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o nome do %d° funcionário: ", i + 1);
            nomes[i] = sc.nextLine();

            System.out.printf("Digite o sexo do %d° funcionário (M/F): ", i + 1);
            sexos[i] = sc.next().toUpperCase().charAt(0);

            System.out.printf("Digite o sálario do %d° funcionário: R$ ", i + 1);
            salarios[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Funcionárias mulheres que ganham mais de R$5 mil: ");
        for (int i = 0; i < nomes.length; i++) {
            if (sexos[i] == 'F' && salarios[i] > 5000) {
                System.out.printf("Nome: %s, Sexo: %s, Sálario: R$ %.2f%n", nomes[i], sexos[i], salarios[i]);
            }
        }

        sc.close();
    }
}
