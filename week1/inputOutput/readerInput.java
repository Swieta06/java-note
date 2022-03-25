package week1.inputOutput;

import java.io.*;
import java.util.Scanner;

public class readerInput {
    public static void main(String[] args) throws IOException {
        readInput();
        readOutput();
    }

    private static void  readOutput() throws IOException {
        //System.out.println("output");
        BufferedReader output=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\inputOutput\\readerInput.text"));
        double ln1,ln2,ln3,ln4,ln5,rumus;
        ln1=Double.parseDouble(output.readLine());
        ln2=Double.parseDouble(output.readLine());
        ln3=Double.parseDouble(output.readLine());
        ln4=Double.parseDouble(output.readLine());
        ln5=Double.parseDouble(output.readLine());
        /*System.out.println("line 1 : "+ln1);
        System.out.println("line 2 : "+ln2);
        System.out.println("line 3 : "+ln3);
        System.out.println("line 4 : "+ln4);
        System.out.println("line 5 : "+ln5);*/
        output.close();

        PrintWriter ouptnilai=new PrintWriter((new FileWriter("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\inputOutput\\outputNilai.text")));
        //System.out.println("masuk output nilai");
        rumus=(ln1+ln2+ln3+ln4+ln5)/5;
        String r="Rata-Rata : ";
        ouptnilai.println(ln1);
        ouptnilai.println(ln2);
        ouptnilai.println(ln3);
        ouptnilai.println(ln4);
        ouptnilai.println(ln5);
        ouptnilai.println(r+rumus);
        ouptnilai.close();


    }

    private static void readInput() throws IOException {
        System.out.println("input");
        double n1,n2,n3,n4,n5;
        Scanner k= new Scanner(System.in);
        PrintWriter output=new PrintWriter(new FileWriter("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week1\\inputOutput\\readerInput.text"));
        n1=input(k,"n1");
        n2=input(k,"n2");
        n3=input(k,"n3");
        n4=input(k,"n4");
        n5=input(k,"n5");
        output.println(n1);
        output.println(n2);
        output.println(n3);
        output.println(n4);
        output.println(n5);
        output.close();
    }
  private static double input(Scanner k,String n){
       System.out.print(n+" : ");
        double key=k.nextInt();
        return key;
    }

}
