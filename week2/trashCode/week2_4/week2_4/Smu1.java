package week2.trashCode.week2_4.week2_4;

public class Smu1 implements School, University {
    private String nama;

    @Override
    public String namaSekolah() {
        return "SMU1";
    }

    @Override
    public void printSiswa() {
        System.out.println("siswa di smu1");
    }

    @Override
    public String getStudent() {
        return this.nama;
    }

    @Override
    public void printUniversity() {
        System.out.println("print university");
    }
}
