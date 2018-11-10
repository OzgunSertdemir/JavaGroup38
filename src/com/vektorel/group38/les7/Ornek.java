package com.vektorel.group38.les7;

import com.vektorel.group38.les9.Kisi;

import java.util.Random;
import java.util.Scanner;

/**
 * Kelime Oyunu
 */
public class Ornek {

    String[][] sozluk = new String[][]{
            {"Okul", "school"},
            {"Bugün", "today"},
            {"Ders", "lesson"},
            {"Yemek", "food"},
            {"Kitap", "Book"},
            {"Kalem", "pencil"},
            {"bilgisayar", "computer"},
            {"Bardak", "cup"}
    };

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ornek ornek = new Ornek();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dil Seçiniz EN->TR 1 giriniz TR->EN 2 giriniz");
        int giris = sc.nextInt();

        if (giris == 1) {
            ornek.ingilizce();
        } else {
            ornek.turkce();
        }
    }

    public void ingilizce() {
        int toplamTahminSayisi = 0;
        int sorulanKelimeSayisi = 0;
        boolean cikmakIstiyor = false;

        while (!cikmakIstiyor) {
            int sorulacakKelimeIndisi = random.nextInt(sozluk.length);
            System.out.println(sozluk[sorulacakKelimeIndisi][1] + " Kelimesinin türkçesini giriniz veya çıkış için exit giriniz ");
            sorulanKelimeSayisi++;

            while (true) {
                String girilenKelime = scanner.nextLine();
                if (girilenKelime.equalsIgnoreCase("exit")){
                    cikmakIstiyor = true;
                    break;
                }else{
                    toplamTahminSayisi++;
                }

                if (!sozluk[sorulacakKelimeIndisi][0].equalsIgnoreCase(girilenKelime)) {
                    System.out.println("Tekrar dene");
                }else{
                    break;
                }
            }
        }

        if(toplamTahminSayisi!=0) {
            System.out.println(sorulanKelimeSayisi + " Kelime sordum " + toplamTahminSayisi + " tahminde buldun Başarın %" + (sorulanKelimeSayisi * 100 / toplamTahminSayisi));
        }
    }

    public void turkce() {

    }


}
