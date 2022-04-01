package week2.trashCode.week2_4.week2_4;

public class Utama {
    public static void main(String[] args) {
        // abstract class
        Person siswa = new Siswa();
        Person guru = new Guru();

        Guru.GuruTk nama = new Guru.GuruTk();
        nama.printGuruTk();
        Guru guru1 = new Guru();
        Guru.GuruSd guruSd = guru1.new GuruSd();
        guruSd.printGuruSd();

        siswa.setNama("Jensen");
        System.out.println("siswa.getNama() = " + siswa.getNama());

        // interface
        School smu1 = new Smu1();
        System.out.println(smu1.namaSekolah());
        smu1.printSiswa();
    }
}
