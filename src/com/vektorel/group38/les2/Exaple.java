package com.vektorel.group38.les2;


import java.util.Scanner;

public class Exaple {

    public static void main(String[] args) {
        Exaple exaple=new Exaple();
        exaple.aritmetik2();
    }

    /**
     * Bu method tamsayı işlem yapar
     */
    public void aritmetik() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir değer giriniz");
        int deger1 = scanner.nextInt();

        System.out.println("Bir değer giriniz");
        int deger2 = scanner.nextInt();

        //int sa = ((deger1+deger2)*(deger2-deger1))/deger1;

        System.out.println("Toplam : " + (deger1 + deger2));
        System.out.println("Fark : " + (deger1 - deger2));
        System.out.println("Çarpım : " + (deger1 * deger2));
        System.out.println("Bölüm : " + (deger1 / deger2));

        //System.out.println(sa);
    }

    /**
     * Bu method kesirli işlem yapar
     */
    public void aritmetik2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir değer giriniz");
        Double deger1 = scanner.nextDouble();

        System.out.println("Bir değer giriniz");
        Double deger2 = scanner.nextDouble();

        //int sa = ((deger1+deger2)*(deger2-deger1))/deger1;

        System.out.println("Toplam : " + (deger1 + deger2));
        System.out.println("Fark : " + (deger1 - deger2));
        System.out.println("Çarpım : " + (deger1 * deger2));
        System.out.println("Bölüm : " + (deger1 / deger2));

        //System.out.println(sa);
    }
}
