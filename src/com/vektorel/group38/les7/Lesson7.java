package com.vektorel.group38.les7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson7 {

    public static void main(String[] args) {
        Lesson7 lesson7 = new Lesson7();
        lesson7.ornek5();
    }

    /*Array*/
    public void basitDizi() {

        int[] d1 = new int[5];
        int d2[] = new int[5];
        String[] d3 = new String[5];
        boolean[] d4 = new boolean[50];
        int[] d5 = new int[]{5, 3, 7};
        String[] d6 = new String[]{"Taner", "Ahmet", "Mehmet"};

        Integer[] d7 = new Integer[10];

        System.out.printf(d6[1]);

    }


    public void ornek1() {
        int[] a = new int[]{5, 7, 3, 6, 36, 56, 7};

        int buyuk = a[0];
        for (int i = 1; i < a.length; i++) {
            if (buyuk < a[i]) {
                buyuk = a[i];
            }
        }
        System.out.println(buyuk);


        Arrays.sort(a);
        System.out.println(a[a.length - 1]);

    }

    public void ornek2() {
        int[] a = new int[]{5, 7, 3, 6, 36, 56, 77, 23, 45};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                a[i] = a[i] * 2;
            } else {
                a[i] = a[i] - 1;
            }
            System.out.println(a[i]);
        }
    }

    public void ornek3() {
        int[] a = new int[]{5, 7, 3, 6, 36, 56, 77, 23, 45};
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                int deger = random.nextInt(26) + 65;
                System.out.print((char) deger);
            }
            System.out.println();
        }
    }


    public void ornek4() {
        String icerik = "Burada bir metin yazıyor";

        String[] dizi = icerik.split(" ");

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }

    public void ornek5() {
        String[][] sozluk = new String[][]{
                {"Okula", "school"},
                {"Bugün", "today"},
                {"Ders", "lesson"},
                {"Yemek", "food"},
                {"Yedim", "eat"},
                {"geldim", "come"},
                {"bitti", "over"}
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Metin giriniz");
        String giris = scanner.nextLine();

        String[] kelimeler = giris.split(" ");

        for (int i = 0; i<kelimeler.length;i++){
            for (int j =0; j<sozluk.length;j++){
                if(sozluk[j][0].toLowerCase().equals(kelimeler[i].toLowerCase())){
                    System.out.print(sozluk[j][1] + " ");
                }
            }
        }

    }
}
