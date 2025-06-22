import java.util.Locale;
import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura da parede: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da parede: ");
        double altura = sc.nextDouble();

        double area = largura * altura;
        double qtdeTinta = area / 2; // A cada litro de tinta pinta uma área de 2 metros quadrados

        System.out.printf("Área = %.2f m²%n", area);
        System.out.printf("Quantidade de tinta necessária: %.2f litros%n", qtdeTinta);

        sc.close();
    }
}
