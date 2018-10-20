package com.vektorel.group38.les2;

/*

Ctrl+Alt+L  Kodu formatlamak için

 */
public class Aritmethic {
    
    public static  String ad="Taner";
    public void toplama(int sayi1, int sayi2) {
        // 5 + 7 = 12

        int toplam = sayi1 + sayi2;
        System.out.println("Toplam : " + toplam);

        // System.out.println(sayi1 + sayi2);
    }

    public void cikarma(int sayi1, int sayi2) {
        int fark = sayi1 - sayi2;

        System.out.println("Fark : " + fark);
    }

    public void carpma(int sayi1, int sayi2) {
        int carpim = sayi1 * sayi2;
        System.out.println("Çarpım : " + carpim);
    }

    public void bolme(int sayi1, int sayi2) {
        int bolum = sayi1 / sayi2;

        System.out.println("Bolum : " + bolum);
    }

    // Scanner

}
