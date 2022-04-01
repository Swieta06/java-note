package week2.polimorfism;

public class mobil extends kendaraan{//mobil child
    private  String merk;
    private int displacement;
    public  mobil(){
super();
    }

    public mobil(String merk,int displacement){
        this.merk=merk;
        this.displacement=displacement;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    //methode
    public static void printKendaraan(){
        System.out.println("kendaraan ini dari mobil.java");
    }
}
