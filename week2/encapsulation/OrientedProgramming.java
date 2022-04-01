package week2.encapsulation;

//field
//constructor
//getter setter
//note:encapsulasi field harus private
public class OrientedProgramming {
    private String nama;
    private int usia;

    //start encapsulasi

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    //end incapsulasi

    //constractot
    public OrientedProgramming(){

    }

  public OrientedProgramming(String name,int age){//constructor
      this.nama=name;
      this.usia=age;

  }


}
