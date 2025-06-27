import java.util.Random;
import java.util.Scanner;

public class Exercicio055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("       ADIVINHAÇÃO     ");
        System.out.println("-----------------------");
        System.out.println();

        Random random = new Random();
        int numeroMaquina = random.nextInt(10) + 1;

        int i = 0;
        while (i < 4) {
            System.out.print("Escolha um número entre 1 e 10: ");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroMaquina) {
                System.out.println("Você adivinhou!!");
                break;
            } else {
                System.out.println("Você errou! Tente novamente");
                System.out.println();
            }

            i++;
        }

        if (i == 4) {
            System.out.printf("Você não conseguiu adivinhar! O número era: %d%n", numeroMaquina);
        }

        sc.close();
    }
}
