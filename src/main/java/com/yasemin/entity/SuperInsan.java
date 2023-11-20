package com.yasemin.entity;

import com.yasemin.enums.Cinsiyet;

public class SuperInsan extends Insan  {
    public SuperInsan() {
    }

    public SuperInsan(String ad, String soyad, Cinsiyet cinsiyet, int yas, int telefon, String adres, boolean asiliMi, boolean hastaMi, boolean tasiyiciMi) {
        super(ad, soyad, cinsiyet, yas, telefon, adres, asiliMi, false, false);
    }
}
