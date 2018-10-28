package com.vektorel.group38.les6;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        SayiTahminOyunu sayiTahminOyunu =new SayiTahminOyunu();
        sayiTahminOyunu.tahmin();
    }

    public void tahmin() {
        while (true) {
            int toplamPuan = 20;
            System.out.println("--------------------- Sayı Tahmin Oyunu ---------------------");
            int tutulanSayi = random.nextInt(100);

            System.out.println("Uygulamadan çıkmak için -1 giriniz");

            System.out.println("Aklımda bir sayı tuttum hadi tahmin et..");

            while (true) {
                int kullaniciGirilenSayi = scanner.nextInt();

                if (kullaniciGirilenSayi == -1) {
                    System.exit(0);
                }

                if (tutulanSayi == kullaniciGirilenSayi) {
                    System.out.println(" Toplam puanın : " + (toplamPuan <= 0 ? 1 : toplamPuan));
                    System.out.println("--------------------- Doğru bildin ---------------------");
                    break;
                } else if (tutulanSayi > kullaniciGirilenSayi) {
                    System.out.println("Daha büyük bir sayı gir");
                    toplamPuan = toplamPuan - 4;
                } else {
                    System.out.println("Daha küçük bir sayı gir");
                    toplamPuan = toplamPuan - 4;
                }
            }
        }
    }
}
