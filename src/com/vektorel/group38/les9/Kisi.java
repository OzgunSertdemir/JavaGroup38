package com.vektorel.group38.les9;

import java.util.Date;

public class Kisi {

    private String ad;
    private String soyad;
    private Date yas;
    private Boolean cinsiyet;
    private Long tc;

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

    public Date getYas() {
        return yas;
    }

    public void setYas(Date yas) {
        this.yas = yas;
    }

    public Boolean getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }
}
