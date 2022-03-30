package week2.Hw2_2;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
      Scanner k=new Scanner(System.in);
        int a ;
        System.out.print("enter value = ");
        a= k.nextInt();
        for (int b = 1; b <= a; b++){
            for (int c = 7; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.print('@');
            }
            System.out.println();
        }

    }


}
