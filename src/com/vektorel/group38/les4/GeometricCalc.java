package com.vektorel.group38.les4;

import java.util.Scanner;

public class GeometricCalc {

    public void islemler() {
        System.out.println("Geometrik işlemler için kenar giriniz");
        Scanner scanner = new Scanner(System.in);
        int kenar = scanner.nextInt();
        kareHesaplama(kenar);
        ucgenHesaplama(kenar);
        cemberHesaplama(kenar);
    }

    public void kareHesaplama(int r) {
        System.out.println("Kenarı " + r + " olan Karenin çevresi : " + (4 * r));
        System.out.println("Kenarı " + r + " olan Karenin alanı : " + (r * r));
    }

    public void cemberHesaplama(int r) {
        System.out.println("Çemberin çevresi : " + (2 * Math.PI * r));
        System.out.println("Çemberin alanı : " + (Math.PI * r * r));
    }

    public void ucgenHesaplama(int r) {
        System.out.println("Üçgenin çevresi : " + (3 * r));
        System.out.println("Üçgenin alanı : " + ((r * r * Math.sqrt(3)) / 4));
    }
}
