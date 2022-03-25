package week1;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("n1: ");
        double n1= k.nextDouble();
        System.out.print("n2: ");
        double n2= k.nextDouble();

        if (n1==n2){
            System.out.println("n1 == n2");
        }else {
            System.out.println("n1 != n2");
        }

    }
}
