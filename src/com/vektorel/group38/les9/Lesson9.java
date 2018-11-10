package com.vektorel.group38.les9;

import java.util.ArrayList;
import java.util.List;

public class Lesson9 {

    public static void main(String[] args) {
        Lesson9 lesson9 = new Lesson9();
        lesson9.customTypeDef();
    }

    public void basitListeIslemleri() {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Integer deger = list.get(1);

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.remove(0));
        System.out.println(list.indexOf(20));
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
    }

    public void customTypeDef() {
        Kisi kisi = new Kisi();
        kisi.setAd("Ahmet");
        kisi.setSoyad("KARA");

        List<Kisi> list = new ArrayList<>();

        list.add(kisi);

        Kisi k2 = new Kisi();
        k2.setSoyad("CEMAL");
        k2.setAd("Mehmet");
        list.add(k2);

        Kisi t = list.get(0);
        System.out.println(t.getAd() + t.getSoyad());
    }


    public Kisi testMethod() {
        Kisi k2 = new Kisi();
        k2.setAd("Mehmet");
        k2.setSoyad("CAN");
        return k2;
    }
}
