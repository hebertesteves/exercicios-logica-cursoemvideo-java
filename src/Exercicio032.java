import java.util.Random;
import java.util.Scanner;

public class Exercicio032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("       ADIVINHAÇÃO     ");
        System.out.println("-----------------------");
        System.out.println();

        Random random = new Random();
        int numeroMaquina = random.nextInt(5) + 1;

        System.out.print("Escolha um número entre 1 e 5: ");
        int numeroUsuario = sc.nextInt();

        if (numeroUsuario == numeroMaquina) {
            System.out.println("Você adivinhou!!");
        } else {
            System.out.printf("Você errou! O número era o %d%n", numeroMaquina);
        }

        sc.close();
    }
}
