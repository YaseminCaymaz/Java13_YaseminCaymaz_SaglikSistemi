package com.yasemin.entity;

import com.yasemin.DataBase.SaglikDB;
import com.yasemin.DataBase.SaglikDB.*;

public class Saglik {
    public void asilamaYap(Insan insan){
        if(!insan.isAsiliMi()){
            insan.setAsiliMi(true);
            SaglikDB.arrayBoyutKontrol();
            SaglikDB.asilananInsanlar[SaglikDB.asilananInsanSayisi++]=insan;
            System.out.println("Asılama yapıldı");
        }
    }
}
