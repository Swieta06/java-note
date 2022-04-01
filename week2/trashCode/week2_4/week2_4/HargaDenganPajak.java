package week2.trashCode.week2_4.week2_4;

public class HargaDenganPajak extends Harga {
    private String nama = "Kevin";

    public HargaDenganPajak(double harga) {
        super(harga);
    }

    public HargaDenganPajak(double harga, String nama) {
        super(harga);
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double hargaBarang() {
        double pajak = 10./100 * getHargaTanpaPajak();
        return hargaTanpaPajak + pajak;
    }
}
