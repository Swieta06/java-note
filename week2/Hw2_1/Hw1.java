package week2.Hw2_1;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        String huruf, hasil = "";
        Scanner k=new Scanner(System.in);
        System.out.print("Masukan kalimat: ");
        huruf = k.nextLine();
        int jumlah = huruf.length();
        int jumlahHuruf = jumlah - 1;
        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + huruf.charAt(jumlahHuruf);
            jumlahHuruf--;
        }
        System.out.println("Kalimat terbalik: " + hasil);
    }
}
