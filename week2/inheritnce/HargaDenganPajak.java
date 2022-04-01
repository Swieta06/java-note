package week2.inheritnce;

import week2.inheritnce.Harga;

public class HargaDenganPajak extends Harga {
    private  String nama;


    //const
   public HargaDenganPajak(double harga){
       //call parent class
        super(harga);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public HargaDenganPajak(double harga, String nama){
       super(harga);
       this.nama=nama;
    }
    //methode
    public  double hargaBarang(){
       double pajak =10/100.*harga;
       return super.harga+pajak;
    }
}
