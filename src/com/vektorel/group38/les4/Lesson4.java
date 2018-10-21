package com.vektorel.group38.les4;

import java.util.Scanner;

public class Lesson4 {

    public void forDongusu() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Sayaç : " + i);
        }

        /*
            i++ -> i = i+1;
            i-- -> i = i-1;
            i+=2 -> i = i+2;
         */

    }

    /**
     * sıfırdan 100 e kadar olan çift sayılar
     */
    public void forDongusu2() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println("Sayaç : " + i);
        }
    }

    /**
     * 2X+5
     */
    public void ikiXArti5() {

        for (int i = 1; i < 100; ) {
            System.out.println(i);
            i = i * 2 + 5;
        }
    }

    /**
     * 2X+5
     */
    public void ikiXArti52() {
        int i = 0;
        for (i = 0; i < 100; ) {
            System.out.println(i);
            i = i * 2 + 5;
        }
    }

    /**
     * 2X+5
     */
    public void ikiXArti53() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                return;
            }
        }
    }

    /**
     * 2X+5
     */
    public void ikiXArti54() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            System.out.println("test");
        }
    }


    public void asalSayi() {
        for (int i = 3; i < 100000; i++) {
            boolean asalDegil = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalDegil=false;
                    break;
                }
            }
            if(asalDegil){
                System.out.println(i);
            }
        }
    }

    public void sayiyiYaziyaCevirenMethod(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = girilenSayi % 10;
        int onlarBasamagi = (girilenSayi-birlerBasamagi)/10;

        if(girilenSayi==0)
            System.out.println("Sıfır");
        else if(girilenSayi<10)
            System.out.println(birlerYazdir(birlerBasamagi));
        else if(girilenSayi>=10)
            System.out.println(onlarYazdir(onlarBasamagi) + birlerYazdir(birlerBasamagi));

    }

    public String onlarYazdir(int deger){
        if (deger==1)
            return "On";
        if (deger==2)
            return "Yirmi";
        if (deger==3)
            return "Otuz";
        if (deger==4)
            return "Kırk";
        if (deger==5)
            return "Elli";
        if (deger==6)
            return "Altmış";
        if (deger==7)
            return "Yetmiş";
        if (deger==8)
            return "Seksen";
        if (deger==9)
            return "Doksan";
        return "";
    }

    public String birlerYazdir(int deger){
        if (deger==1)
            return "Bir";
        if (deger==2)
            return "İki";
        if (deger==3)
            return "Üç";
        if (deger==4)
            return "Dört";
        if (deger==5)
            return "Beş";
        if (deger==6)
            return "Alti";
        if (deger==7)
            return "Yedi";
        if (deger==8)
            return "Sekiz";
        if (deger==9)
            return "Dokuz";
        return "";
    }

    public void tamKarekokBulanMethod(){
        //karekok();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int girilenSayi = scanner.nextInt();

        if(girilenSayi>0){
            int sayac=0;
            int girilen =girilenSayi;
            for (int i=1;i<girilen;i+=2){
                sayac++;
                if(girilenSayi<i){
                    break;
                }
                girilenSayi = girilenSayi-(i);
            }

            System.out.println("Tam Karekök:" + (sayac));
        }
    }

    public void karekok(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Tam Karekök için deger giriniz:");
        int girilenDeger = scanner.nextInt();
        int farkMiktari=1;
        int toplam=0;
        System.out.println(Math.sqrt(girilenDeger));

        for (int i=0;i<girilenDeger;i++){
            toplam = toplam +farkMiktari;
            if(girilenDeger<toplam){
                System.out.println(i);
                break;
            }
            farkMiktari =farkMiktari+2;
        }
    }
}




































