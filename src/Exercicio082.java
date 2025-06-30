import java.util.Locale;
import java.util.Scanner;

public class Exercicio082 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do %d° aluno: ", i + 1);
            notas[i] = sc.nextDouble();
        }
        System.out.println();

        double somaNota = 0.0;
        for (int i = 0; i < notas.length; i++) {
            somaNota += notas[i];
        }
        double mediaTurma = somaNota / notas.length;
        System.out.printf("A média da turma é %.2f%n", mediaTurma);

        int quantidadeAcimaDaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
           if (notas[i] > mediaTurma) {
               quantidadeAcimaDaMedia++;
           }
        }
        System.out.printf("A quantidade de alunos acima da média é %d%n", quantidadeAcimaDaMedia);

        double maiorNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        System.out.printf("A maior nota digitada é %.2f%n", maiorNota);

        System.out.print("A maior nota aparece nas posições: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == maiorNota) {
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }
}
