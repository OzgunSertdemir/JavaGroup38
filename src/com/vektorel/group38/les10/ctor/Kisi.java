package com.vektorel.group38.les10.ctor;

import java.util.Date;

public class Kisi {

    private String ad;
    private String soyad;
    private Date dogumTarihi;

    //-------------------------------
    public Kisi() {
    }

    public Kisi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public Kisi(String ad, String soyad, Date dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    //-------------------------------


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
