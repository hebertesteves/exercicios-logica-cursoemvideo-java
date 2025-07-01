import java.util.Scanner;

public class Exercicio093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o fim: ");
        int fim = sc.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        contador(inicio, fim, incremento);

        sc.close();
    }

    public static void contador(int inicio, int fim, int incremento) {
        for (int i = inicio; i < fim; i += incremento) {
            System.out.printf("%d >> ", i);
        }
        System.out.printf("FIM");
    }
}
