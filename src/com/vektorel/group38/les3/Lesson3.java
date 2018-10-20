package com.vektorel.group38.les3;

public class Lesson3 {

    public void parametresizMethod(){
        System.out.println("Parametresiz Method Çalıştı");
    }

    public void parametreliMethod(String adSoyad ,int yas){
        System.out.println("Parametreli method çalıştı");
        System.out.println("Girilen Ad Soyad : " + adSoyad);
        System.out.println("Girilen Yaş : " + yas);
    }

    /**
     *
     * @param adSoyad
     * @param yas
     * @return
     */
    public String parametreliReturnluMethod(String adSoyad, int yas){
        System.out.println("Girilen Ad Soyad : " + adSoyad);
        System.out.println("Girilen Yaş : " + yas);
        return "parametreliMethod tamamlandı";
    }

    /**
     *  Aşağıdaki fonksiyonu gerçekleyen method
     *      *  x^2 + y^2-2xy
     * @param x adfasdf
     * @param y - adsf
     * @return geri dönüşümüz
     */
    public int fonksiyonHesapla(int x,int y){
        int sonuc = x*x + y*y - 2*x*y;
        return sonuc;
    }
}
