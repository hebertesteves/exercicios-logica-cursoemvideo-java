public class Exercicio089 {
    public static void main(String[] args) {
        gerador("Portugol Studio", 3, 2);
    }

    public static void gerador(String texto, int quantidade, int tipo) {
        String borda = "";
        switch (tipo) {
            case 1:
                borda = "+-------=======------+";
                break;
            case 2:
                borda = "~~~~~~~~:::::::~~~~~~~";
                break;
            case 3:
                borda = "<<<<<<<<------->>>>>>>";
                break;
        }

        System.out.println(borda);
        for (int i = 0; i < quantidade; i++) {
            System.out.println("  " + texto);
        }
        System.out.println(borda);
    }
}
