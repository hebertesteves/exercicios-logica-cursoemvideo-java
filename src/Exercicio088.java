public class Exercicio088 {
    public static void main(String[] args) {
        gerador("Aprendendo Portugol", 4);
    }

    public static void gerador(String texto, int quantidade) {
        System.out.println("+-------=======------+");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("  " + texto);
        }
        System.out.println("+-------=======------+");
    }
}
