package week2.trashCode.week2_4.week2_4;

public class Utama2 {
    public static void main(String[] args) {

        Harga[] benda = new Harga[4];
        benda[0] = new Harga(250);
        benda[1] = new Harga(375);
        benda[2] = new HargaDenganPajak(250, "odol");
        benda[3] = new HargaDenganPajak(375);

        final String namaFinal = "nama final";
        System.out.println("namaFinal = " + namaFinal);

        ((HargaDenganPajak) benda[3]).setNama("sikat gigi");
        String bendaNama3 = ((HargaDenganPajak) benda[3]).getNama();
        System.out.println("bendaNama3 = " + bendaNama3);

        for (int i=0; i<benda.length; i++) {
            System.out.println("benda[" + i + "] = " + benda[i].hargaBarang());
        }

        Harga.staticField = "nama Jensen";
        System.out.println(Harga.staticField);
    }
}

