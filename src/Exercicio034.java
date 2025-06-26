import java.util.Locale;
import java.util.Scanner;

public class Exercicio034 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);

        System.out.print("Classificação: ");
        if (imc < 18.5) {
            System.out.print("Abaixo do peso");
        } else if (imc < 25) {
            System.out.print("Peso ideal");
        } else if (imc < 30) {
            System.out.print("Sobrepeso");
        } else if (imc < 40) {
            System.out.print("Obesidade");
        } else {
            System.out.print("Obesidade mórbida");
        }

        sc.close();
    }
}
