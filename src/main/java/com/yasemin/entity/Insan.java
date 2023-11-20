package com.yasemin.entity;

import com.yasemin.enums.Cinsiyet;

import java.rmi.server.UID;
import java.util.UUID;

public abstract class Insan  {
    private String id;
    private String ad;
    private String soyad;
    private Cinsiyet cinsiyet;
    private int yas;
    private int telefon;
    private String adres;
    private boolean asiliMi;
    private boolean hastaMi;
    private boolean tasiyiciMi;

    public Insan() {
        this.id= UUID.randomUUID().toString();
    }

    public Insan(String ad, String soyad, Cinsiyet cinsiyet, int yas, int telefon, String adres, boolean asiliMi, boolean hastaMi, boolean tasiyiciMi) {
        this.id= UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.telefon = telefon;
        this.adres = adres;
        this.asiliMi = asiliMi;
        this.hastaMi = hastaMi;
        this.tasiyiciMi = tasiyiciMi;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", yas=" + yas +
                ", telefon=" + telefon +
                ", adres='" + adres + '\'' +
                ", asiliMi=" + asiliMi +
                ", hastaMi=" + hastaMi +
                ", tasiyiciMi=" + tasiyiciMi +
                '}';
    }

    public String getId() {
        return id;
    }

    public boolean isAsiliMi() {
        return asiliMi;
    }

    public void setAsiliMi(boolean asiliMi) {
        this.asiliMi = asiliMi;
    }

    public boolean isHastaMi() {
        return hastaMi;
    }

    public void setHastaMi(boolean hastaMi) {
        this.hastaMi = hastaMi;
    }

    public boolean isTasiyiciMi() {
        return tasiyiciMi;
    }

    public void setTasiyiciMi(boolean tasiyiciMi) {
        this.tasiyiciMi = tasiyiciMi;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

}
