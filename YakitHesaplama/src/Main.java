import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınız kilometrede ne kadar yakıyor ? (Örnek: 0,32)");
        double kurus = scanner.nextDouble();
        System.out.println("Aracınızla Kaç Kilometre Gittiniz?");
        int km = scanner.nextInt();
        System.out.println("Toplam ödenecek tutar:" + (kurus *km) + "tldir");0
    }
}