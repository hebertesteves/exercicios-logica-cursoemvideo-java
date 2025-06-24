import java.util.Random;
import java.util.Scanner;

public class Exercicio031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("         JoKenPo       ");
        System.out.println("-----------------------");
        System.out.println();

        String[] valores = {"pedra", "papel", "tesoura"};
        Random random = new Random();

        System.out.print("Escolha entre (pedra, papel ou tesoura): ");
        String escolhaUsuario = sc.next().toLowerCase();
        String escolhaMaquina = valores[random.nextInt(3)];

        System.out.println("Usuário: " + escolhaUsuario);
        System.out.println("Máquina: " + escolhaMaquina);

        if (
                 (escolhaUsuario.equals("pedra") && escolhaMaquina.equals("tesoura")) ||
                 (escolhaUsuario.equals("tesoura") && escolhaMaquina.equals("papel")) ||
                 (escolhaUsuario.equals("papel") && escolhaMaquina.equals("pedra"))
        ) {
            System.out.println("Você venceu!!");
        } else if (
                 (escolhaMaquina.equals("pedra") && escolhaUsuario.equals("tesoura")) ||
                 (escolhaMaquina.equals("tesoura") && escolhaUsuario.equals("papel")) ||
                 (escolhaMaquina.equals("papel") && escolhaUsuario.equals("pedra"))
        ) {
            System.out.println("Você perdeu!!");
        } else if (escolhaUsuario.equals(escolhaMaquina)) {
            System.out.println("Empate!!");
        } else {
            System.out.println("Jogada inválida!");
        }

        sc.close();
    }
}
