package week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read =new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week3\\data_sekolah.csv"));
        int[] listnilai=new int[11];
        for ( int i=0;i<listnilai.length;i++){
            System.out.println(listnilai[0]);//listnilai[0]=0
        }
        String text=read.readLine();
        //perintah untyk mencetak lebih dari satu line
        while (text!=null){
            String[] NILAI=text.split(";");
            System.out.println(NILAI[NILAI.length-1]);
            for (int i=1;i<NILAI.length;i++){

              listnilai[Integer.parseInt(NILAI[i])]++;
            }
            for ( int i=0;i<listnilai.length;i++){
                System.out.println(listnilai[0]);//listnilai[0]=0
            }
            System.out.println(listnilai);
            text=read.readLine();

        }

    }
}
