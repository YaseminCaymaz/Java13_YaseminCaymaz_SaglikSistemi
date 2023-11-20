package com.yasemin.DataBase;

import com.yasemin.entity.Insan;
import com.yasemin.DataBase.SaglikDB.*;
public class SaglikDBManager {
    /**
     * Asılanan insanları liste şeklinde sadece isim ve soyisim olarak ekrana yazdırır.
     */
    public void raporEkrani(){
        if (SaglikDB.asilananInsanSayisi!=0){
            System.out.println("Aşı yapılan kişilerin listesi..:");
            int i=1;
            for(Insan kisi:SaglikDB.asilananInsanlar){
                if (kisi!=null){
                    System.out.println(i+"."+kisi.getAd()+" "+kisi.getSoyad());
                    i++;
                }
            }
            System.out.println();
            System.out.println("Liste bitti...");
            System.out.println();
        }
        else System.out.println("Kayıtlı hiçkimse bulunamadı..");

    }

    /**
     * Asılanan insanları  sırasıyla ve bilgileriyle ekrana yazdırır.
     */

    public void raporEkrani2(){
        if (SaglikDB.asilananInsanSayisi!=0){
            int i=1;
            for (Insan insan: SaglikDB.asilananInsanlar){
                if (insan!=null){
                    System.out.println(i+". Aşılanan Kişinin Bilgileri..:");
                    System.out.println("ID...:"+insan.getId());
                    System.out.println("Ad...:"+insan.getAd());
                    System.out.println("Soyad...:"+insan.getSoyad());
                    System.out.println("Cinsiyet...:"+insan.getCinsiyet());
                    System.out.println("Yaş...:"+insan.getYas());
                    System.out.println("Telefon...:"+insan.getTelefon());
                    System.out.println("Adres...:"+insan.getAdres());
                    System.out.println();
                    i++;
                }
            }
            System.out.println("Liste bitti...");
        }
        else System.out.println("Kayıtlı hiçkimse bulunamadı..");

    }
}
