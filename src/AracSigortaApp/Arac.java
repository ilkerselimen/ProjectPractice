package AracSigortaApp;

public class Arac {

    //Arac ortak ozelliklerini tasiyan class
    //arac tipi, arac primi
    public String type; //field veya feature veya ozellik diyoruz bu degiskenlere
    public int prim;

    public void countPrim(int term){
        switch (this.type){ //this, buclasstan olusturulmus object'sinin type degiskenine bak
            case "otomobil":
                this.prim = term==1 ? 2000 : 2500; //ternary kullandik
                break;
            case "kamyon":
                this.prim = term==1 ? 3000 : 3500;
                break;
            case "motosiklet":
                this.prim = term==1 ? 1500 : 1750;
                break;
            case "otobus":
                countPrimBus();
                break;
        }
    }

    private void countPrimBus(){ //sadece otobuse ozel prim hesaplama methodu

    }


}