package week2.inheritnce;

public class Utama {
    public static void main(String[] args) {
        Harga[] benda=new Harga[4];
        benda[0]=new Harga(250);
        benda[1]=new Harga(375);
        benda[2]=new HargaDenganPajak(375);
        benda[3]=new HargaDenganPajak(375);
        for (int i=0;i<benda.length;i++){
            System.out.println(benda[i].hargaBarag());
        }
    }
}
