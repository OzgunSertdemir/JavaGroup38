package com.vektorel.group38.les3;

import java.util.Scanner;

public class SimpleIfElse {


    public void basitIfElseYapisi(int x, int y) {
        if (x < y) {
            System.out.println("X , Y den küçüktür");
        } else {
            System.out.println("X , Y den büyüktür");
        }
    }

    public void basitIfElseYapisi2(int x, int y) {
        if (x < y) {
            System.out.println("X , Y den küçüktür");
        } else if (x > y) {
            System.out.println("X , Y den büyüktür");
        } else {
            System.out.println("X , Y ye eşittir");
        }
    }


    public void yasAyiranMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Giriniz:");
        String isim = scanner.nextLine();

        System.out.println("Soyadınızı Giriniz:");
        String soyisim = scanner.nextLine();

        System.out.println("Yaşınızı Giriniz:");
        int yas = scanner.nextInt();

        System.out.println("Adınız : " + isim + "\nSoyadınız : " + soyisim);

        if (yas > 0 && yas < 6) {
            System.out.println("Çocuk");
        } else if (yas >= 6 && yas < 18) {
            System.out.println("Genç");
        } else if (yas >= 18 && yas < 35) {
            System.out.println("Orta Yaş");
        } else if (yas >= 35 && yas < 155) {
            System.out.println("Yaşlı");
        } else {
            System.out.println("Bir Yanlışlık var gibi");
        }
                
        System.out.println("Yaşınız : " + yas);


    }
}
