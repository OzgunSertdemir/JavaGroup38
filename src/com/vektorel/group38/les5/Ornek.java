package com.vektorel.group38.les5;

import com.vektorel.group38.les2.Exaple;
import com.vektorel.group38.les4.GeometricCalc;
import com.vektorel.group38.les4.Lesson4;

import java.util.Scanner;

public class Ornek {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        Ornek ornek = new Ornek();
        ornek.login();
    }

    public void login() {
        boolean kullaniciAdiSifreDogruDegil = true;

        while (kullaniciAdiSifreDogruDegil) {
            System.out.println("Kullanıcı Adını Giriniz:");
            String username = scanner.nextLine();

            System.out.println("Şifrenizi giriniz:");
            String sifre = scanner.nextLine();

            if (username.equals("user") && sifre.equals("user")) {
                kullaniciAdiSifreDogruDegil = false;
                userMenu();
            } else if (username.equals("admin") && sifre.equals("admin")) {
                kullaniciAdiSifreDogruDegil = false;
                adminMenu();
            } else {
                System.out.println("Kullnıcı adı veya şifre hatalı");
            }
        }

    }

    private void adminMenu() {
        while (true) {
            System.out.println("-----------------MENÜ----------------------");
            System.out.println("Geometrik için 0 \nAritmetik için 1 \nKarekok için 2 \nÇıkış için 3 giriniz");
            int islemTipi = scanner.nextInt();
            islemlerMenusu(islemTipi);
            System.out.println("---------------------------------------");
        }
    }

    private void userMenu() {
        while (true) {
            System.out.println("-----------------MENÜ----------------------");
            System.out.println("Geometrik için 0 \nAritmetik için 1 \nÇıkış için 3 giriniz");
            int islemTipi = scanner.nextInt();
            islemlerMenusu(islemTipi);
            System.out.println("---------------------------------------");
        }
    }

    public void islemlerMenusu(int islemTipi) {
        Exaple exaple = new Exaple();
        Lesson4 lesson4 = new Lesson4();
        GeometricCalc geometricCalc=new GeometricCalc();

        switch (islemTipi) {
            case 0:
                geometricCalc.islemler();
                break;
            case 1:
                exaple.aritmetik();
                break;
            case 2:
                lesson4.karekok();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

}
