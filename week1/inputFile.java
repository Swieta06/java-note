package week1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class inputFile {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\contoh.txt"));

        String baris1=reader.readLine();
        int baris2=Integer.parseInt(reader.readLine());
        Boolean baris3=Boolean.parseBoolean(reader.readLine());
        char baris4=reader.readLine().charAt(2);
        String baris5=reader.readLine();

        System.out.println("baris 1="+baris1);
        System.out.println("baris 2="+baris2);
        System.out.println("baris 3="+baris3);
        System.out.println("baris 4="+baris4);
        System.out.println("baris 5="+baris5);

        reader.close();
    }
}
