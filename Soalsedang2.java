import java.util.Scanner;

public class Soalsedang2 {
    public static double PermukaanBola(double Jarijari) {
        return 4 * Math.PI * Jarijari;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukan Jari-jari Bola (r): ");
        double Jarijari= s.nextDouble();
        double LuasPermukaan = PermukaanBola(Jarijari);
        System.out.println("Luas Permukaan Bola adalah: " + LuasPermukaan);
    }
}