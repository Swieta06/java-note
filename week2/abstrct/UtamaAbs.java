package week2.abstrct;

public class UtamaAbs {
    public static void main(String[] args) {
        //abstract gak bisa akses klo ngga ada subclass
        PersonAbs siswa1 =new siswa();
        PersonAbs siswa2 =new siswa();
        PersonAbs guru =new Guru();

        siswa1.setNama("jesson");
        siswa2.setNama("admin");
        System.out.println("siswa1.getnama "+siswa1.getNama());
        System.out.println("siswa2.getnama "+siswa2.getNama());
        //end

        //interface
        // new nama class yang diimplementasikan
        School smu1 =new Smu1();
        System.out.println(smu1.namaSekolah());
        smu1.PrintSiswa();
        //end interface

        //start step2
        PersonAbs jenson =new PersonAbs() {
            @Override
            public void kerjaUjian() {
                System.out.println("jensen kerja ujian");
            }

            @Override
            public String printNama() {
                return "jenson";
            }
        };
        jenson.kerjaUjian();
        System.out.println(jenson.printNama());;

        //end step 2
    }
}
