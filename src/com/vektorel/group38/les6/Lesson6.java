package com.vektorel.group38.les6;

import java.util.Scanner;

/**
 * String methodları
 */
public class Lesson6 {

    public static void main(String[] args) {
        new Lesson6().basitSifrelemeAlgoritmasi();
    }


    public void basitStringIslemleri() {
        String icerik = "Bunun içerisinde Rasgele bir metin var ";
        System.out.println(icerik.charAt(0));
        System.out.println(icerik.codePointAt(0));
        System.out.println(icerik.contains("ç"));
        System.out.println(icerik.indexOf("u"));
        System.out.println(icerik.lastIndexOf("a"));
        System.out.println(icerik.isEmpty());
        System.out.println(icerik.length());
        System.out.println(icerik.replace("ç", "c"));
        System.out.println(icerik.toLowerCase());
        System.out.println(icerik.toUpperCase());
        System.out.println(icerik.substring(2, 17));
        System.out.println(icerik.replaceAll("i", "İ"));
        System.out.println(icerik.toUpperCase().concat(" Taner".toUpperCase()));
    }


    /**
     * 2x+6 formatındaki fonksiyonları çözer
     */
    public void fonksiyonHesaplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Denklem Giriniz:");
        String denklem = scanner.nextLine();

        String degsken = denklem.substring(1, 2);

        System.out.println(degsken + " degerini giriniz.");
        int bilinmeyen = scanner.nextInt();

        // Type Casting (String to Integer)
        int digit1 = Integer.valueOf(denklem.substring(0, 1));

        int digit2 = Integer.valueOf(denklem.substring(3, 4));

        System.out.println(digit1 * bilinmeyen + digit2);
    }

    public void fonksiyonHesaplama2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Denklem Giriniz:");
        String denklem = scanner.nextLine();

        String degsken = denklem.substring(1, 2);

        System.out.println(degsken + " degerini giriniz.");
        int bilinmeyen = scanner.nextInt();

        // Type Casting (String to Integer)
        int digit1 = Integer.valueOf(denklem.substring(0, 1));

        String operator = denklem.substring(2, 3);

        int digit2 = Integer.valueOf(denklem.substring(3, 4));

        int sonuc = 0;
        if (operator.equals("+"))
            sonuc = digit1 * bilinmeyen + digit2;
        else if (operator.equals("-"))
            sonuc = digit1 * bilinmeyen - digit2;
        else if (operator.equals("*"))
            sonuc = digit1 * bilinmeyen * digit2;
        else if (operator.equals("/"))
            sonuc = digit1 * bilinmeyen / digit2;

        System.out.println(sonuc);
    }

    public void basitSifrelemeAlgoritmasi() {

        System.out.println("Metin Gir");
        Scanner scanner = new Scanner(System.in);
        String mtin = scanner.nextLine();
        String sifreliHali = "";
        for (int i = 0; i < mtin.length(); i++) {
            int deger = mtin.codePointAt(i);
            //deger++;
            if(deger%2==0)
                deger=deger+3;
            else
                deger= deger-3;
            sifreliHali += (char) deger; // sifreliHali = sifreliHali+ (char) deger;
        }
        System.out.println(sifreliHali);

        for (int i = 0; i < sifreliHali.length(); i++) {
            int deger = sifreliHali.codePointAt(i);
            //deger++;
            if(deger%2==0)
                deger=deger+3;
            else
                deger= deger-3;
            System.out.print((char) deger);
        }
    }
}



















