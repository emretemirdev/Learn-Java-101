import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. İşlem: Toplama\n"
                + "2. İşlem: Çıkarma\n"
                + "3. İşlem: Çarpma\n"
                + "4. İşlem: Bölme\n"
                + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("********************************");
        System.out.println("İşlemi seçiniz: ");
        String islem = scanner.nextLine();
        int a, b;
        switch (islem) {
            case "1":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Toplam: " + (a + b));
                break;

            case "2":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Çıkarma: " + (a - b));
                break;
            case "3":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Çarpma: " + (a * b));
                break;

            case "4":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Bölme: " + ((double) a / b));
                break;
            case "q":
                System.out.println("Programdan çıkılıyor...");
                break;
            default:
                System.out.println("Geçersiz işlem...");
        }
    }
}