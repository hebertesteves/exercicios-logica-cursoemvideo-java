import java.util.Scanner;

public class Exercicio017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro: ");
        int velocidade = sc.nextInt();

        if (velocidade > 80) {
            System.out.println("Você foi multado por andar acima da velocidade!!");
            int valorMulta = (velocidade - 80) * 5;
            System.out.printf("Valor a ser pago: R$ %d", valorMulta);
        }

        sc.close();
    }
}
