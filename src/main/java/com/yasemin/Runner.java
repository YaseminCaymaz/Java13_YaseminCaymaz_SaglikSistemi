package com.yasemin;

import com.yasemin.DataBase.SaglikDBManager;
import com.yasemin.entity.Doktor;
import com.yasemin.entity.NormalInsan;
import com.yasemin.entity.Saglik;
import com.yasemin.entity.SuperInsan;
import com.yasemin.enums.Cinsiyet;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Saglik saglik=new Saglik();
        SuperInsan superInsan=new SuperInsan();
        Doktor doktor=new Doktor();
        NormalInsan insan=new NormalInsan("Yasemin","Caymaz", Cinsiyet.KADIN,28,5487,"Gaziantep",false,true,true);
        saglik.asilamaYap(insan);
        NormalInsan insan1=new NormalInsan("Mehmet","Demir",Cinsiyet.ERKEK,31,54876,"Karabuk",false,true,false);
        saglik.asilamaYap(insan1);
        NormalInsan insan2=new NormalInsan("Hasan","Can",Cinsiyet.ERKEK,15,85697,"İstanbul",false,true,true);
        saglik.asilamaYap(insan2);

        secim();





    }







    public static SaglikDBManager saglik1=new SaglikDBManager();

    /**
     * Konsol ekranına yazdırıldı
     */
    public static void ekran(){
        System.out.println("************************");
        System.out.println("****** İSLEMLER ********");
        System.out.println("************************");
        System.out.println("1.Aşılanan kişilerin Listesini Göster");
        System.out.println("2.Listedeki Kişi Bilgilerini Göster");
        System.out.println("0.ÇIKIS");
        System.out.println("Lütfen bir seçim yapınız..:");
    }

    /**
     * Seçim yaptıktan sonra gitmesi gereken yere yönlendirme yapıldı
     */
    public static void secim(){
        int secim=0;
        do {
            ekran();
            secim=new Scanner(System.in).nextInt();
            switch (secim){
                case 1:saglik1.raporEkrani();break;
                case 2:saglik1.raporEkrani2();break;
                case 0:System.out.println("Cıkıs yapılıyor.");break;
                default: System.out.println("Hatalı seçim yaptınız.Lütfen tekrar deneyiniz.");break;
            }
        }while (secim!=0);

    }

}
