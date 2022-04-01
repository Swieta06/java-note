package week2.abstrct;

public abstract class PersonAbs {
    protected String nama;

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void kerjaUjian();
    //abstrac methode gak boleh ada isi body
    //override hanya untuk abstract
    //boleh ada field
    public abstract  String printNama();
    //abtract non methode
    public void kerjaTuga(){
        System.out.println("Kerja Tugas");
    }
}
