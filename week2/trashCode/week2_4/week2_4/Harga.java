package week2.trashCode.week2_4.week2_4;

public class Harga {
    protected double hargaTanpaPajak;
    public static String staticField;

    // constructor: no-arg constructor atau default constructor
    public Harga() {
    }

    // constructor dengan satu argument
    public Harga(double harga) {
        this.hargaTanpaPajak = harga;
    }

    // getter
    public double getHargaTanpaPajak() {
        return this.hargaTanpaPajak;
    }

    // setter
    public void setHargaTanpaPajak(double harga) {
        this.hargaTanpaPajak = harga;
    }

    // toString
    @Override
    public String toString() {
        return "hargaTanpaPajak = " + hargaTanpaPajak;
    }

    public double hargaBarang() {
        return this.hargaTanpaPajak;
    }
}