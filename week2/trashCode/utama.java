package week2.trashCode;

public class utama {
    public static void main(String[] args) {
        Hewan name=new klasifikasi();
        System.out.print("Hewan");
        System.out.println("Jumlah Kaki");
        name.setNamaHewan("ikan");
        name.setFaVoritFood("makaan");
        //name.getNumberOfLeg(0);
        //System.out.println(name.jumlahKaki());
        //name.setNamaHewan("cumi-cumi");
        System.out.print(name.getNamaHewan());
        System.out.print(name.getFaVoritFood());

        System.out.print("    "+name.getNumberOfLeg(0));

    }



}
