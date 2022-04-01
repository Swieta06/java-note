package week2.trashCode.week2_4.week2_4;

public abstract class Person {
    protected String nama;

    public abstract void kerjaUjian();

    public abstract String printNama();

    public void kerjaTugas() {
        System.out.println("KErja tugas");
    }

    protected String getNama() {
        return this.nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }
}
