import java.util.Random;
import java.util.Scanner;

public class Exercicio050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0;
        int contAcima5 = 0;
        int contDivisivel3 = 0;

        System.out.printf("Números Sorteados: ");
        while (i < 20) {
            int num = random.nextInt(11);
            System.out.printf("%d ", num);

            if (num > 5) {
                contAcima5++;
            }

            if (num % 3 == 0) {
                contDivisivel3++;
            }

            i++;
        }

        System.out.println();
        System.out.printf("A quantidade de números acima de 5: %d%n", contAcima5);
        System.out.printf("A quantidade de números divisíveis por 3: %d%n", contDivisivel3);

        sc.close();
    }
}
