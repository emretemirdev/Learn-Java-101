public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor(); // Profesör oluşturuluyor
        Professor p2 = new Professor(); // Profesör oluşturuluyor
        Professor p3 = new Professor(); // Profesör oluşturuluyor
        p1.kahveYap(); // p1 nesnesi üzerinden kahve yapılıyor
    }
}

class Professor{ // Profesör sınıfı
    SuIsiticisi si = new SuIsiticisi(); // Su ısıtıcısı oluşturuluyor
    KahveKavanozu kk = new KahveKavanozu(); // Kahve kavanozu oluşturuluyor
    Musluk musluk = new Musluk(); // Musluk oluşturuluyor

    void kahveYap() {
        try {
            si.ac(); // Su ısıtıcısını aç
            musluk.suekle(); // Musluğu aç ve suyu kahve makinesine doldur
            kk.ac(); // Kahve makinesini aç
            kk.kahveAl(100, si); // Kahve makinesinden 100 gram kahve al ve sıcak su ekle
            kk.kapa(); // Kahve makinesini kapat
            musluk.kapa(); // Musluğu kapat
            si.kapa(); // Su ısıtıcısını kapat
        } catch (Exception e) { // Oluşabilecek hataları yakala
            System.out.println("Hata oluştu: " + e.getMessage());
            // Hata ile ilgili işlemler burada yapılır, örneğin kahve makinesi ve su ısıtıcısı kapatılır
            kk.kapa();
            musluk.kapa();
            si.kapa();
        }
    }


}
class SuIsiticisi{ // Su ısıtıcısı sınıfı
    void ac() // Su ısıtıcısını açan metot
        {
            System.out.println("Su Isiticisi Acildi");
        }
    void kapa() // Su ısıtıcısını kapatan metot
        {
            System.out.println("Su Isiticisi Kapatildi");
        }
}

class KahveKavanozu{ // Kahve kavanozu sınıfı
    private int kahveMiktari = 200; // Kavanozda başlangıçta 200 gram kahve olsun

    void ac() // Kahve kavanozunu açan metot
        {
            System.out.println("Kahve Kavanozu Acildi");
        }
    void kapa() // Kahve kavanozunu kapatan metot
        {
            System.out.println("Kahve Kavanozu Kapatildi");
        }
    void kahveAl(int miktar, SuIsiticisi si) // Kahve kavanozundan kahve alıp su ısıtıcısına ekleyen metot
        {
            if (miktar <= kahveMiktari) { // Kavanozda yeterli miktarda kahve varsa devam et
                System.out.printf("Kavanozdan %d gr Kahve Alindi\n", miktar);
                kahveMiktari -= miktar; // Kavanozdaki kahve miktarını azalt
            } else { // Kahve miktarı kavanozdaki kahveden fazlaysa hata mesajı yazdır
                throw new RuntimeException("Kahve kavanozunda yeterli miktarda kahve yok!");
            }
        }
}


class Musluk{ // Musluk sınıfı
    void suekle() // Musluk açılarak su eklenen metot
        {
            System.out.println("Su Eklendi");
        }
    void kapa() // Musluk kapatılan metot
        {
            System.out.println("Musluk Kapatildi");
        }
}