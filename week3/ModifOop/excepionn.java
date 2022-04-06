package week3.ModifOop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class excepionn {
    public static void main(String[] args) {

errr2();

    }
    public static void errr1(){
        Scanner k=new Scanner(System.in);
        try {


            System.out.print("masukan nomor = ");
            int n =k.nextInt();
            //int value=100/0;
            //System.out.println("value = "+value);
        }catch (Exception e){
            System.out.println("masukan int/angka");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("masuk sini meski ada atau gak ada error");
            k.close();
        }

    }
    public static void errr2(){
        Scanner k=new Scanner(System.in);
        boolean isNumber=false;
        int n=0;
        while(!isNumber) {
            try {
                System.out.print("masukan nomor = ");
                n = k.nextInt();
                isNumber=true;
                //int value=100/0;
                //System.out.println("value = "+value);
            } catch (InputMismatchException e) {
                k.nextLine();
                System.out.println("masukan int/angka "+e.getMessage());
               // System.out.println(e.getMessage());

            }
        }
        throw new InputMismatchException("NOMOR HARUS ANGKA");

    }
    public static void errr4(){
        Scanner k=new Scanner(System.in);
        System.out.print("masukan nomor = ");
        int n=k.nextInt();
        if( n==0) {
            throw new InputMismatchException("NOMOR HARUS ANGKA");
        }else{
            System.out.println("int = "+n);
        }

    }
    public static void bacaDariScan(Scanner K){

    }
}
