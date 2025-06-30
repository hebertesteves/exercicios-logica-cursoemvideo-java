import java.util.Scanner;

public class Exercicio084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[9];
        int[] idades = new int[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %d° nome: ", i + 1);
            nomes[i] = sc.nextLine();

            System.out.printf("Digite a %d° idade: ", i + 1);
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Menor de idade: ");
        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] < 18) {
                System.out.printf("Nome: %s, Idade: %d anos.%n", nomes[i], idades[i]);
            }
        }

        sc.close();
    }
}
