package week1;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Masukan huruf = ");
       char huruf= k.next().charAt(0);
     if (huruf=='a'||huruf=='i'||huruf=='u'||huruf=='e'||huruf=='o'){
         System.out.println(huruf+" merupakan huruf vocal");
     }else {
         System.out.println((huruf+" merupakan huruf konsonan"));
     }
    }
}
