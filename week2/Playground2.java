package week2;

import java.util.Scanner;

public class Playground2 {
    public static void main(String[] args) {
        //example1();
        example3();
    }
    public static void example1(){
        int n=6;
        while (n>=6 && n<=10){
            System.out.println("n = "+n);
            n++;//n=n+1
        }
        System.out.println("udh keluar dari while loop");
    }
    public  static  void  example2(){
        Scanner k=new Scanner(System.in);
        System.out.println("input n :");
        int n =k.nextInt();
        while (n!=0){
            System.out.println("n"+n);
            System.out.println("masukan angka 0 untuk keluar");
        n=k.nextInt();
        }
        System.out.println("udh keluar");
    }
    public static void example3(){

        for (int i=0;i<10;i++){
            if (i==3) {
               continue;
            }
            System.out.println("print 1-10 except 3 "+i);

        }

    }

}
