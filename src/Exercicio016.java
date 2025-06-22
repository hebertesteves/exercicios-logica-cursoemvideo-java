import java.util.Scanner;

public class Exercicio016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosDia = sc.nextInt();

        System.out.print("Digite a quantidade de anos que já fumou: ");
        int anoFumou = sc.nextInt();

        int cigarrosTotal = cigarrosDia * 365 * anoFumou;
        int minutosPerdidos = 10 * cigarrosTotal;
        int diasPerdidos = minutosPerdidos / 1440;

        System.out.printf("Você perdeu aproximadamente %d dias de vida.%n", diasPerdidos);

        sc.close();
    }
}
