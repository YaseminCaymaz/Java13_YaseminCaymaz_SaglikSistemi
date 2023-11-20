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
        System.out.println("1.Asılanan kişinin bilgilerini gir");
        System.out.println("2.Aşılanan kişilerin Listesini Göster");
        System.out.println("3.Listedeki Kişi Bilgilerini Göster");
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
                case 1:kaydet();break;
                case 2:saglik1.raporEkrani();break;
                case 3:saglik1.raporEkrani2();break;
                case 0:System.out.println("Cıkıs yapılıyor.");break;
                default: System.out.println("Hatalı seçim yaptınız.Lütfen tekrar deneyiniz.");break;
            }
        }while (secim!=0);

    }

    /**
     * Konsol ekranından aşılanacak kişinin bilgilerini alır.
     */
    public static void kaydet(){
        Scanner sc=new Scanner(System.in);
        NormalInsan insan=new NormalInsan();
        Saglik saglik=new Saglik();
        System.out.println("Ad...:");
        insan.setAd(sc.nextLine());
        System.out.println("Soyad...:");
        insan.setSoyad(sc.nextLine());
        System.out.println("Cinsiyet...:(K/E)");
        String ifade=sc.nextLine();
        if (ifade.equalsIgnoreCase("k"))
            insan.setCinsiyet(Cinsiyet.KADIN);
        else insan.setCinsiyet(Cinsiyet.ERKEK);
        System.out.println("Yaş....:");
        insan.setYas(sc.nextInt());
        System.out.println("Telefon...:");
        insan.setTelefon(sc.nextInt());
        System.out.println("Adres...:");
        sc.nextLine();
        insan.setAdres(sc.nextLine());
        System.out.println("Aşılı mi?...:(E/H)");
        ifade=sc.nextLine();
        if(ifade.equalsIgnoreCase("h"))
            insan.setAsiliMi(false);
        else insan.setAsiliMi(true);
        System.out.println("Hasta mi?...:(E/H)");
        ifade=sc.nextLine();
        if(ifade.equalsIgnoreCase("h"))
            insan.setHastaMi(false);
        else insan.setHastaMi(true);
        System.out.println("Tasıyıcı mi?...:(E/H)");
        ifade=sc.nextLine();
        if(ifade.equalsIgnoreCase("h"))
            insan.setBulasiciMi(false);
        else insan.setBulasiciMi(true);
        saglik.asilamaYap(insan);
    }

}
