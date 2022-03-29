package week2;

import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {

    }
    public  static void scnd(){
        int a=2;
        int b=3;
      /* if (a>b){
            System.out.println("a lebih besar dari b");

        }else {
            System.out.println("b lebih besar dari a");
        }*/

    }
    public static void first(){
        Scanner k=new Scanner(System.in);
        System.out.print("masukan nilai=");
        String hasil;
        hasil= k.nextLine();

        switch (hasil){
            case "a":
                hasil="lulus";
                break;
            case "b":
                hasil="baik";
                break;
            case "c":
                hasil="pas";
                break;
            default:
                hasil="td lulus";
        }
        System.out.println("Hasil = "+hasil);
    }

}
