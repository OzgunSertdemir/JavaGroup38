package com.vektorel.group38.les10.iface;

public class AritmetikIslemlerImpl implements AritmetikIslemler {

    @Override
    public int toplama(int a, int b, int c) {
        int sonuc = a + b + c;
        return sonuc;
    }

    @Override
    public int carpma(int a, int b) {
        return a * b;
    }

    @Override
    public int bolme(int a, int b) {
        if (b != 0)
            return a / b;
        else
            return 0;
    }

    @Override
    public int cikarma(int a, int b) {
        return a-b;
    }

    public void test(){

    }



}
