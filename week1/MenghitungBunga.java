package week1;

import java.util.Arrays;
import java.util.Scanner;

public class MenghitungBunga {
    //2. Buat program Java untuk menghitung jumlah uang beserta bunga.
    //
    //A) Dana awal 10 juta dengan suku bunga 0.5% per bulan. Berapa uang yang diterima setelah 4 tahun?
    //B) Dana awal 15 juta dengan suku bunga 6% per tahun. Berapa uang yang diterima setelah 5 tahun?
    //
    //A = p * (1 + r/n)^tn,
    //
    //P = dana awal
    //r = suku bunga
    //n = berapa kali bunga diterapkan per periode waktu
    //t = jumlah periode waktu yang berlalu
    public static void main(String[] args) {

        double A,p,r,n,t;

        Scanner k=new Scanner(System.in);
        System.out.print("Masukan dana awal : ");
        p=input(k);
        System.out.print("Masukan suku bunga: ");
        r=input(k);
        System.out.print("masukan bunga per periode: ");
        n=input(k);
        System.out.print("masukan jumlah periode: ");
        t=input(k);
        double tn=n*t;
        A=p*Math.pow((1+r/n),tn);
        System.out.println("jumlah uang beserta bunga adalah : "+A);

    }
    public static double input(Scanner k){
        double key= k.nextDouble();
        return key;
    }
}
