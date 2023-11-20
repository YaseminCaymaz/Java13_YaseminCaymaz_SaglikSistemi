package com.yasemin.entity;

import com.yasemin.DataBase.SaglikDB;
import com.yasemin.DataBase.SaglikDB.*;

public class Saglik {
    /**
     * Normal insanlara aşılı degilse aşı yapılır ve aşı yapılanların listesine ekler.
     * @param insan
     */
    public void asilamaYap(Insan insan){
        if(!insan.isAsiliMi()){
            insan.setAsiliMi(true);
            SaglikDB.arrayBoyutKontrol();
            SaglikDB.asilananInsanlar[SaglikDB.asilananInsanSayisi++]=insan;
            System.out.println("Asılama yapıldı");
        }
    }
}
