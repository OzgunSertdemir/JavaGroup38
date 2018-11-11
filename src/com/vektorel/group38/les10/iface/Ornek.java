package com.vektorel.group38.les10.iface;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Ctor
 */
public class Ornek {

    public static void main(String[] args) {
        AritmetikIslemler aritmetikIslemler = new AritmetikIslemlerImpl();
        System.out.println(aritmetikIslemler.carpma(20,30));

        AritmetikIslemler aritmetikIslemler1 =new AritmetikImpl();
        System.out.println(aritmetikIslemler1.carpma(20,30));

    }
}
