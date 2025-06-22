import java.util.Locale;
import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double distancia = sc.nextDouble();

        System.out.println("A distância de "+ distancia + "m corresponde a: ");

        double km = distancia / 1000;
        System.out.println(km + "Km");

        double hm = distancia / 100;
        System.out.println(hm + "Hm");

        double dam = distancia / 10;
        System.out.println(dam + "Dam");

        double dm = distancia * 10;
        System.out.println(dm + "dm");

        double cm = distancia * 100;
        System.out.println(cm + "cm");

        double mm = distancia * 1000;
        System.out.println(mm + "mm");

        sc.close();
    }
}
