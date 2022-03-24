package week1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class consoleFileInput {
    //buat aplikasi: input dari keyboard:nama,alamat,usia,udah lulus kuliah
    //output file
    public static void main(String[] args) throws IOException {
        Scanner k=new Scanner(System.in);
        PrintWriter write=new PrintWriter(new FileWriter(""));
    }
    private static void input(Scanner k) {
        String input = k.nextLine();

    }
}
