import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km, acilisucreti = 10;
        double kmbasiucret = 2.20, toplamtutar;
        int indibindi = 20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Kilometreyi Giriniz : ");
        km = input.nextInt();

        toplamtutar = acilisucreti + (km * kmbasiucret);

        toplamtutar = (toplamtutar < 20) ? 20 : toplamtutar;
        System.out.println("Ödenecek Tutar : " + toplamtutar);
    }
}