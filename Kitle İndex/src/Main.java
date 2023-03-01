import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz");
        int kilo = scanner.nextInt();
        System.out.println("Lütfen Boyunuzu Giriniz: (Örnek: 1,72)");
        double boy = scanner.nextDouble();
        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz:"+bki);
        //Yorumlama
        if(bki < 18.5){
            System.out.println("Zayıfsınız.");
        }else if(bki >= 18.5 && bki <= 24.9){
            System.out.println("Normal kilodasınız.");
        }else if(bki >= 25 && bki <= 29.9){
            System.out.println("Fazla kilolusunuz.");
        }else if(bki >= 30 && bki <= 34.9){
            System.out.println("1. derece obezsiniz.");
        }else if(bki >= 35 && bki <= 39.9){
            System.out.println("2. derece obezsiniz.");
        }else{
            System.out.println("3. derece obezsiniz.");
        }
    }
}
