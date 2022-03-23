package week1;
import java.util.Scanner;

public class Gradient {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter nama : ");
        //buat input string
        String n = keyboard.nextLine();
        //buat input integer
        System.out.print("enter x1: ");
        int x1= keyboard.nextInt();
        System.out.print("enter x2: ");
        int x2 = keyboard.nextInt();
        System.out.print("enter x3: ");
        int y1 = keyboard.nextInt();
        System.out.print("enter x4: ");
        int y2 = keyboard.nextInt();
        double gradient = ( y2-y1)/(x2-x1);
        System.out.println("gradient= " + gradient);
    }
}
