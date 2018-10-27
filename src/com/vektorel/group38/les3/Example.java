package com.vektorel.group38.les3;


import com.vektorel.group38.les2.Exaple;

import java.util.Scanner;

public class Example {

    Scanner scanner = new Scanner(System.in);
    Exaple exaple = new Exaple();
    SimpleIfElse simpleIfElse = new SimpleIfElse();

    public static void main(String[] args) {
        Example example = new Example();
        example.kullaniciGiris();

    }

    public void kullaniciGiris() {
        System.out.println("Kullanıcı Adınızı Giriniz:");
        String username = scanner.nextLine();

        System.out.println("Kullanıcı Şifrenizi Giriniz:");
        String pass = scanner.nextLine();


        if (username.equals("user") && pass.equals("user")) {
            userMenu(username);
        } else if (username.equals("admin") && pass.equals("admin")) {
            adminMenu(username);
        } else {
            System.out.println("Kullanıcı Adı veya Şifren Yanlış");
        }

    }

    public void adminMenu(String username) {
        System.out.println("Hoşgeldin " + username);
        System.out.println("Aritmetik işlemler yapmak için 1 giriniz");
        System.out.println("Yaş işlemleri yapmak için 2 giriniz");
        System.out.println("Çıkış için 3 giriniz");
        int giris = scanner.nextInt();

        if (giris == 1) {
            exaple.aritmetik2();
        } else if (giris == 2) {
            simpleIfElse.yasAyiranMethod();
        } else if (giris == 3) {
            System.exit(1);
        } else {
            System.out.println("Yanış bir giriş yaptınız");
        }
    }

    public void userMenu(String username) {
        System.out.println("Hoşgeldin " + username);
        System.out.println("Aritmetik işlemler yapmak için 1 giriniz");
        System.out.println("Çıkış için 2 giriniz");
        int giris = scanner.nextInt();
        if (giris == 1) {
            exaple.aritmetik2();
        } else if (giris == 2) {
            System.exit(1);
        } else {
            System.out.println("Yanış bir giriş yaptınız");
        }
    }
}
