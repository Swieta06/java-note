package week1;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter Name :");
        String nama = k.nextLine();

        System.out.print("Enter Ege :");
        int ege = k.nextInt();
        k.nextLine();

        System.out.print("Enter address :");
        String address = k.nextLine();

        System.out.print("Enter GPA :");
        double gpa = k.nextDouble();
        k.nextLine();

        System.out.print("are u married?(y/n)");
        String m = k.nextLine();


        System.out.println("====Biodata=====");
        System.out.println("Nama Saya "+nama);
        System.out.println("Usia Saya "+ege);
        System.out.println("Alamat Saya "+address);
        System.out.println("IPK saya "+gpa);
        System.out.println("sudah menikah "+m);

    }
}
