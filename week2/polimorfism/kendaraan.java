package week2.polimorfism;

public class kendaraan {
    private  String tipe;
//const
    public kendaraan(){}
    public kendaraan(String tipe){
        this.tipe=tipe;
    }
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    //methode
    public static void printKendaraan(){
        System.out.println("kendaraan ini dari kendaraan.java");
    }
}
