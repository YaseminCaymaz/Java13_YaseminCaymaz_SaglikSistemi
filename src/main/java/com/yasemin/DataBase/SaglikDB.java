package com.yasemin.DataBase;

import com.yasemin.entity.Insan;

public class SaglikDB {
    //Asılanan insanların bilgilerini arrayda tutar
    public static Insan[] asilananInsanlar=new Insan[50];

    //Asılanan insanların sayılarını tutar
    public static int asilananInsanSayisi=0;

    //Asılanan insanların sayısı array boyutunu doldurdugunda yeni boyut atar.
    public static void arrayBoyutKontrol(){
        if (asilananInsanSayisi==asilananInsanlar.length){
            Insan [] temp=new Insan[asilananInsanlar.length+50];
            for (int i = 0; i <asilananInsanlar.length ; i++) {
                temp[i]=asilananInsanlar[i];
            }
            asilananInsanlar=temp;
        }

    }
}
