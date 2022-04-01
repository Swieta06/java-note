package week2.inheritnce;

public class Harga {
   protected double harga;
    //contructor no-arg/default
   public Harga(){

   }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
  //toString

    @Override
    public String toString() {
        return "Harga{" +
                "harga=" + harga +
                '}';
    }
public double hargaBarag(){
       return this.harga;
}
    //contractor with one field
    public Harga(double harga){
       this.harga=harga;
    }
}
