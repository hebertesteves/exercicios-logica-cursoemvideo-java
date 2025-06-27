import java.util.Locale;
import java.util.Scanner;

public class Exercicio054 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double somaAltura = 0.0;
        int quantidadeMais90kg = 0;
        int quantidadeComMenosDe50kgE160cm = 0;
        int quantidadeComMaisDe100kgE190cm = 0;

        while (i < 7) {
            System.out.printf("Digite o peso da %d° pessoa: ", i + 1);
            double peso = sc.nextDouble();

            System.out.printf("Digite a altura da %d° pessoa: ", i + 1);
            double altura = sc.nextDouble();

            if (peso > 90) {
                quantidadeMais90kg++;
            }

            if (peso < 50 && altura < 1.60) {
                quantidadeComMenosDe50kgE160cm++;
            }

            if (peso > 100 && altura > 1.90) {
                quantidadeComMaisDe100kgE190cm++;
            }

            somaAltura += altura;
            i++;
        }

        double mediaAltura = somaAltura / 7.0;

        System.out.printf("A média de altura do grupo é: %.2f%n", mediaAltura);
        System.out.printf("A quantidade de pessoas que pesam mais de 90kg é: %d%n", quantidadeMais90kg);
        System.out.printf("A quantidade de pessoas que pesam menos de 50kg e tem menos de 1.60m é: %d%n", quantidadeComMenosDe50kgE160cm);
        System.out.printf("A quantidade de pessoas que pesam mais de 100kg e tem mais de 1.90m é: %d%n", quantidadeComMaisDe100kgE190cm);

        sc.close();
    }
}
