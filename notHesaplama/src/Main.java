import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //ÜNİVERSİTEM İÇİN HARF NOTU HESAPLAMA PROGRAMI YAPILACAK!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize 1: ");
        int vize1 = scanner.nextInt();
        System.out.print("Vize 2: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final: ");
        int finalNotu = scanner.nextInt();
        double ortalama = (vize1 * 0.3) + (vize2 * 0.3) + (finalNotu * 0.4);
        if (ortalama >= 90)
            System.out.println("Harf notu: AA");
        else if (ortalama >= 85)
            System.out.println("Harf notu: BA");
        else if (ortalama >= 80)
            System.out.println("Harf notu: BB");
        else if (ortalama >= 75)
            System.out.println("Harf notu: CB");
        else if (ortalama >= 70)
            System.out.println("Harf notu: CC");
        else if (ortalama >= 65)
            System.out.println("Harf notu: DC");
        else if (ortalama >= 50)
            System.out.println("Harf notu: DD");
        else if (ortalama >= 40)
            System.out.println("Harf notu: FD");
        else
            System.out.println("Harf notu: FF DERSTEN KALDINIZ");
    }
}