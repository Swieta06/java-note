package week2.polimorfism;

public class Utamakendaraan {
    public static void main(String[] args) {
        //kendaraan as parent,mobil as child
       kendaraan toyota = new kendaraan();
       kendaraan honda =new mobil("toyota",2500);
        kendaraan.printKendaraan();
        mobil.printKendaraan();


    }
}
