import java.util.Locale;
import java.util.Scanner;

public class Exercicio068 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;
        int quantidadeHomensMais100 = 0;
        double somaPesoMulheres = 0.0;
        double maiorPesoHomens = 0.0;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o sexo da %d° pessoa (M/F): ", i + 1);
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.printf("Digite o peso da %d° pessoa: ", i + 1);
            double peso = sc.nextDouble();

            if (sexo == 'M') {
                if (quantidadeHomens == 0) {
                    maiorPesoHomens = peso;
                } else if (peso > maiorPesoHomens) {
                    maiorPesoHomens = peso;
                }

                if (peso > 100) {
                    quantidadeHomensMais100++;
                }

                quantidadeHomens++;
            } else if (sexo == 'F') {
                somaPesoMulheres += peso;
                quantidadeMulheres++;
            }
        }

        double mediaPesoMulheres = somaPesoMulheres / quantidadeMulheres;

        System.out.printf("A quantidade de mulheres cadastradas é: %d%n", quantidadeMulheres);
        System.out.printf("A quantidade de homens que pesam mais de 100Kg é: %d%n", quantidadeHomensMais100);
        System.out.printf("A média de peso entre as mulheres é: %.2f Kg%n", mediaPesoMulheres);
        System.out.printf("O maior peso entre os homens é: %.2f Kg%n", maiorPesoHomens);

        sc.close();
    }
}
