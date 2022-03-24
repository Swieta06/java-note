package week1;

import java.util.Scanner;

public class JaraKoordinat {
    //1. Buat program java yang menghitung jarak antara dua koordinat (x1, y1) dan (x2, y2) yang memiliki rumus:
    //√(x2-x1)²+(y2-y1)²
    public static void main(String[] args) {
        int x2,x1,y2,y1;
        double rumus;

        Scanner k=new Scanner(System.in);
        //soal("X1");
        x1=input(k,"X1");
        //soal("Y1");
        y1=input(k,"X2");
        //soal("x2");
        x2=input(k,"X3");
        //soal("Y2");
        y2=input(k,"X4");
        rumus = (Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2))));
        System.out.println("Jarak antara ("+x1+","+y1+")" +" dan " +"("+ x2+","+y2+")"+" = " + rumus);

    }

   /*public  static  String soal(String nilai){
        String s ="Masukan nilai "+nilai+" :";
        System.out.print(s);
        return s;
   }*/
    public static int input(Scanner k,String nilai){
        System.out.print("Enter "+nilai+" : ");
        int key =k.nextInt();
        return key;
    }
}
