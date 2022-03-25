package week1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class outputFile {
    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\";
        String ouput="synergy backend";
        PrintWriter w =new PrintWriter(new FileWriter("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\outputF.txt"));
        w.println(ouput);
w.close();
    }
}
