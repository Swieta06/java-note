package week1;

import java.util.Scanner;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int a,b,c;
        double x1,x2;
        double xm;
        System.out.print("Masukan a : ");
        a=k.nextInt();
        System.out.print("Masukan b : ");
        b=k.nextInt();
        System.out.print("Masukan c : ");
        c=k.nextInt();
        System.out.println(a+"x^ + "+b+"x + "+c+" = 0");
        xm=Math.sqrt(Math.pow(b,2)-(4*a*c));
        x1=(-b+xm)/(2*a);
        x2=(-b-xm)/(2*a);
        System.out.println("X1 = "+x1);
        System.out.println("X2 = "+x2);


    }
}
