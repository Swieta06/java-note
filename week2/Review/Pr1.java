package week2.Review;

public class Pr1 {
    public static void main(String[] args) {
        Hewan[] hewan=new Hewan[3];
        hewan[0]=new Dog();
        hewan[1]=new Fly();
        hewan[2]=new Spider();
        for (int i=0;i< hewan.length;i++){
            System.out.println("Nama Hewan "+hewan[i].getClass().getSimpleName());
            System.out.println("Jumlah Kaki "+hewan[i].getNumberOfLegs());
            System.out.println("Makanan Kesukaan "+hewan[i].getFavoriteFood());

        }
    }
}
