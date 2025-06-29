import java.util.Scanner;

public class Exercicio077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o nome da %d° pessoa: ", i + 1);
            nomes[i] = sc.nextLine();
        }

        System.out.println();
        System.out.println("Listagem dos nomes: ");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
