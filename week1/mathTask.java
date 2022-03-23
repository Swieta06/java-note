package week1;

import java.util.Scanner;

public class mathTask {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        double p,phi=3.14,l,persegi,lingkaran;
        p = inputt(k,"persegi");
        persegi = p*p*p*p;
        System.out.println("luas persegi : "+persegi);
        l =inputt(k,"lingkarang");
        lingkaran = phi*Math.pow(l,2);
        System.out.print("luas lingkaran :" +lingkaran);



    }
    private static double inputt(Scanner k,String bentuk){
        System.out.print("masukan "+bentuk+":");
        double key=k.nextDouble();
        return key;

    }

}
