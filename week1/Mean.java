package week1;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        double t1=nilaiUjian(k,1);
        double t2=nilaiUjian(k,2);
        double t3=nilaiUjian(k,3);
        double t4=nilaiUjian(k,4);


        System.out.println((t1+t2+t3+t4)/4);
    }
    private static double nilaiUjian(Scanner k,int n){
        System.out.print("score test "+n+": ");
        double ujian = k.nextDouble();
        return ujian;
    }
}
