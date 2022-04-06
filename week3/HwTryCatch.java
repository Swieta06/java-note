package week3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class HwTryCatch {
    public static void main(String[] args) {
        try {
           Bmi();
        }catch (Exception e){
            System.out.println("masukan input yang sesuai");
            //System.out.println(e.getMessage());
            Bmi();
        }

    }
    public static void Bmi(){
        Scanner k =new Scanner(System.in);
        double high,weight;
        System.out.print("Masukan Tinggi Anda (m) : ");
        high =k.nextDouble();
        System.out.print("Masukan Berat Anda (kg): ");
        weight =k.nextDouble();
        double rumus= (weight/(Math.pow(high,2)));
        if (rumus>30){
            System.out.println("anda obesitas");

        }else if(rumus>25){
            System.out.println(" Anda kelebihan berat badan");
        }else if(rumus>18.5){
            System.out.println(" Anda anda sehat");
        }else {
            System.out.println("anda kekurangan berat badan");
        }

    }

}
