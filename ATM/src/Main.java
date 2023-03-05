import com.sun.source.tree  .WhileLoopTree;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {     //ATM PROGRAMI YAPILACAK!
        LocalDate bugun = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. İşlem: Bakiye Sorgulama\n"
                + "2. İban Sorgulama\n"
                + "3. Tarih Sorgulama\n"
                + "4. Nakit Avans İşlemi\n"
                + "5. İşlem: Para Yatırma\n"
                + "6. İşlem: Para Çekme\n"
                + "Çıkış için q'ya basın";
        System.out.println(islemler);
        while (true)
        {
            System.out.println("İşemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.println("İbanınız: 123456789");
            }
            else if (islem.equals("3")){
                System.out.println("Tarih: " + bugun);
            }
            else if (islem.equals("4")){
                System.out.println("Avansınız:" + bakiye * 0.1 + "TL");
            }
            else if (islem.equals("5")){
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }
            else if (islem.equals("6")){
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye - tutar < 0){
                    System.out.println("Yetersiz bakiye...");
                    continue;
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }

    }
}