package com.vektorel.group38.les10.ctor;

import java.util.Date;
import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Kisi kisi=new Kisi();


        Kisi kisi1=new Kisi("Taner","TEST");


        Kisi kisi3=new Kisi("Ahmet","TEST",new Date());

        Kisi kisi2 =new Kisi();
        kisi2.setAd("Ahmet");
        kisi2.setSoyad("TEST");
        kisi2.setDogumTarihi(new Date());

        Date date=new Date();
        date.setTime(12);
        date.setYear(2015);

        new Date(2015,15,15);

        System.out.println("");
    }
}
