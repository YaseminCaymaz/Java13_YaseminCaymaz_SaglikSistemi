package com.yasemin.entity;

import com.yasemin.enums.Cinsiyet;

public class Doktor extends Insan  {
    public Doktor() {

    }

    public Doktor(String ad, String soyad, Cinsiyet cinsiyet, int yas, int telefon, String adres, boolean asiliMi, boolean hastaMi, boolean tasiyiciMi) {
        super(ad, soyad, cinsiyet, yas, telefon, adres, true, hastaMi, tasiyiciMi);
    }


}
