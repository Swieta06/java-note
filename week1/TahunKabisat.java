package week1;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner K=new Scanner(System.in);
        int n;
        System.out.print("Masukan Tahun = ");
        n= K.nextInt();
        if ( n % 4== 0) {
            System.out.println(n + " Adalah Tahun Kabisat");
        }else if(n%4==0) {
            System.out.println(n + " Adalah Tahun Kabisat");
        } else if (n%100==0){
            System.out.println(n+ " Bukan Tahun Kabisat");
        }else {
            System.out.println(n+ " Bukan Tahun Kabisat");
        }
    }
}
