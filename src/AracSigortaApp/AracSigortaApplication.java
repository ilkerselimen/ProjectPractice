package AracSigortaApp;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022
       1.dönemi  :Haziran 2022                    2.dönem:Aralık 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
 */
public class AracSigortaApplication {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner inp=new Scanner(System.in);
        boolean isFail;//hesaplamanın durumunu kontrol etmek için bir flag kullanalım
//hatalı girişte veya yeni işlem için menü tekrar gösterilsin :while/do-while
        do {
            isFail=false;
            System.out.println("---Zorunlu Sigorta Primi Hesaplama--");
            System.out.println("Tarife dönemi seçiniz:");
            System.out.println("1.Haziran 2022");
            System.out.println("2.Aralık 2022");
            //exception handle etme
            int term=0;
            try{
                term=inp.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Geçersiz giriş, lütfen sayı giriniz.");
            }
            inp.nextLine();
            //girilen dönem geçerli mi?
            if(term==1 || term==2){

            }else{
                System.out.println("Hatalı giriş!!!");
                isFail=true;
            }

        }while(isFail);


    }
}