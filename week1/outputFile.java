package week1;

import java.io.*;
import java.util.Arrays;

public class outputFile {
    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\";
        int ouput[]={2,2,3,4,5,6,7,8};
        PrintWriter w =new PrintWriter(new FileWriter("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\outputF.txt"));
        w.print(ouput[0]);
        w.print(ouput[1]);
        w.close();
//cetak ke consol
        BufferedReader y=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\outputF.txt"));
        int a=Integer.parseInt(y.readLine());
        System.out.println(a);
    }
}
