package week1;

import java.util.Scanner;

public class TugasPertama {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double beff,mutton,chicken,duck,b,m,d,c;

        beff=75000;
        mutton=35000;
        chicken=35000;
        duck = 50000;

        b = kyCode(k,"beef");
        m = kyCode(k,"mutton");
        c = kyCode(k,"chicken");
        d = kyCode(k,"duck");

        double jumlah = ((b*beff)+(m*mutton)+(c*chicken)+(d*duck));
        System.out.println("total harga yang dibayar : "+ jumlah);

    }
    public static double kyCode(Scanner k,String jenis){
        System.out.print("porsi "+jenis+" yang dipesan:");
        double key=k.nextDouble();
        return key;
    }
}
