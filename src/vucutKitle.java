import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {

        double boy, kilo;

        Scanner endeks = new Scanner(System.in);

        System.out.print("boy:");
        boy = endeks.nextDouble();
        System.out.print("kilo: ");
        kilo = endeks.nextDouble();

        double endeksFormul= kilo / (boy * boy) * 10000;
        System.out.print("Vücut Kitle Endeksi: " +endeksFormul);
    }
}
