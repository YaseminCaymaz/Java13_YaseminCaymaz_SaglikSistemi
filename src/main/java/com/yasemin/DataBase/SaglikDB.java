package com.yasemin.DataBase;

import com.yasemin.entity.Insan;

public class SaglikDB {
    public static Insan[] asilananInsanlar=new Insan[50];
    public static int asilananInsanSayisi=0;
    public static void arrayBoyutKontrol(){
        if (asilananInsanSayisi==asilananInsanlar.length){
            Insan [] temp=new Insan[asilananInsanlar.length+10];
            for (int i = 0; i <asilananInsanlar.length ; i++) {
                temp[i]=asilananInsanlar[i];
            }
            asilananInsanlar=temp;
        }

    }
}
