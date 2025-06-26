import java.util.Locale;
import java.util.Scanner;

public class Exercicio035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo do carro (popular ou luxo): ");
        String tipoCarro = sc.nextLine().toLowerCase();

        System.out.print("Digite quantos dias de aluguel: ");
        int diasAluguel = sc.nextInt();

        System.out.print("Digite quantos km foram percorridos: ");
        double kmPercorrido = sc.nextDouble();

        double valorTotal = 0.0;
        double precoPorKm = 0.0;
        double aluguelPorDia = 0.0;
        if (tipoCarro.equals("popular")) {
            if (kmPercorrido <= 100) {
                precoPorKm = 0.20;
            } else {
                precoPorKm = 0.10;
            }
            aluguelPorDia = 90;
        } else if (tipoCarro.equals("luxo")) {
            if (kmPercorrido <= 200) {
                precoPorKm = 0.30;
            } else {
                precoPorKm = 0.25;
            }
            aluguelPorDia = 150;
        } else {
            System.out.println("Carro inválido");
            sc.close();
            return;
        }

        valorTotal = diasAluguel * aluguelPorDia + kmPercorrido * precoPorKm;
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
