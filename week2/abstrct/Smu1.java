package week2.abstrct;
//interface pakai implements
public class Smu1 implements School{
    private String namaStudent;
    @Override
    public String namaSekolah() {
        return "SMU 1";
    }

    public String getNamaStudent() {
        return namaStudent;
    }

    public void setNamaStudent(String namaStudent) {
        this.namaStudent = namaStudent;
    }

    @Override
    public void PrintSiswa() {
        System.out.println("siswa di smu1");

    }

    @Override
    public String getStudent() {
        return this.namaStudent;
    }
}
