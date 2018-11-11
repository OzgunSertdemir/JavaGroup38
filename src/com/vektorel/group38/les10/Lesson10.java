package com.vektorel.group38.les10;

import com.vektorel.group38.les10.inheritance.Ceo;
import com.vektorel.group38.les10.inheritance.Mudur;
import com.vektorel.group38.les10.inheritance.Ogretmen;

import java.math.BigInteger;

public class Lesson10 {
    public static void main(String[] args) {
        Mudur mudur=new Mudur();
        Ogretmen ogretmen=new Ogretmen();

        mudur.maas=BigInteger.valueOf(2345L);
        mudur.calis();


        ogretmen.maas=BigInteger.valueOf(245L);
        ogretmen.calis();

        Ceo ceo=new Ceo();
        ceo.maas=BigInteger.valueOf(24555L);
        ceo.calis();
    }
}
