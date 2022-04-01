package week2.lastMateri;

public class Student {
    private String nama;
    private int age;
//getter setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//const
    public Student(String nama, int age) {
        this.nama = nama;
        this.age = age;
    }
    //tostring

    @Override
    public String toString() {
        return "Student{" +
                "nama='" + nama + '\'' +
                ", age=" + age +
                '}';
    }
}
