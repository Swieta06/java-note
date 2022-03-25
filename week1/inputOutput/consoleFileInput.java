package week1.inputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class consoleFileInput {
    //buat aplikasi: input dari keyboard:nama,alamat,usia,udah lulus kuliah
    //output file
    public static void main(String[] args) throws IOException {
        Scanner k=new Scanner(System.in);
        String nama=input(k,"nama");
        String alamat =input(k,"alamat");
        int usia=Integer.parseInt(input(k,"usia"));
        char lulus=input(k,"sudah lulus kuliah(y/n)").charAt(0);
        PrintWriter output=new PrintWriter(new FileWriter("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\inputOutput\\consoleFileInputText.txt"));
        output.println(nama);
        output.println(alamat);
        output.println(usia);
        output.println(lulus);
        output.close();
    }
    private static String input(Scanner k,String data) {
        System.out.print(data + ": ");
        return k.nextLine();

    }
}
