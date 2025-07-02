import java.util.Locale;
import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = calcularMedia(nota1, nota2);
        System.out.printf("Média: %.2f%n", media);
        String situacaoAluno = situacao(media);
        System.out.printf("Situação do aluno: %s%n", situacaoAluno);

        sc.close();
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static String situacao(double media) {
        if (media >= 6.0) {
            return "APROVADO";
        } else if (media >= 4.0 && media < 6.0) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }
}
