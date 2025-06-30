import java.util.Locale;
import java.util.Scanner;

public class Exercicio081 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[8];

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a %d° idade: ", i + 1);
            idades[i] = sc.nextInt();
        }

        int somaIdade = 0;
        for (int i = 0; i < idades.length; i++) {
            somaIdade += idades[i];
        }
        double mediaIdade = (double) somaIdade / idades.length;
        System.out.printf("A média das idades digitadas é %.2f%n", mediaIdade);

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 25) {
                System.out.printf("Essa idade %d maior que 25 foi encontrada na posição %d%n", idades[i], i);
            }
        }

        int maiorIdade = idades[0];
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }
        System.out.printf("A maior idade digitada é %d%n", maiorIdade);

        System.out.print("A maior idade foi encontrada nas posições: ");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == maiorIdade) {
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }
}
