package week1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class inputFile {
    public static void main(String[] args) throws IOException {
        //soal1();
        //soal2();
        //soal3();
        //soal4();
        soal5();
    }
    private static void soal1() throws IOException {
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
    public static void soal2 (){
        System.out.println("soal 2");
        int n;
        Scanner k=new Scanner(System.in);
        System.out.print("input nilai: ");
        n= k.nextInt();
        if(n%2==0){
            System.out.println("print genap");

        }else{
            System.out.println("bilangan ganjil");
        }

    }
    private static void soal3(){
        //membuat nilai apakah bisa dibagi 3
        Scanner k=new Scanner(System.in);
        System.out.print("masukan nilai: ");
        int n= k.nextInt();
        if(n%3==0){
            System.out.println("nilai " +n+" bisa dibagi 3");

        }else {
            System.out.println("nilai " +n+" tidak bisa dibagi 3");
        }
    }
    private static void soal4(){
        int angka1, angka2, angka3, maks;
        Scanner k=new Scanner(System.in);
        System.out.print("input nilai 1 :");
        angka1=k.nextInt();
        System.out.print("input nilai 2 :");
        angka2=k.nextInt();
        System.out.print("input nilai 3 :");
        angka3=k.nextInt();

        if (angka1>angka2 && angka1>angka3) {
            maks = angka1;
        } else if (angka2>angka1 && angka2>angka3){
            maks = angka2;
        }
        else{
            maks = angka3;
        }
        System.out.println("Angka maksimum adalah = "+maks);
    }
    private static void soal5(){
        String hari[]={"","Senin","Selasa","Rabu","kamis","jumat","sabtu","minggu"};
        String Hari;
        Scanner k=new Scanner(System.in);
        System.out.print("masukan nilai 1-7 = ");
        Hari= k.nextLine();
        switch (Hari){
            case  "1":
                System.out.println("senin");
            break;
            case  "2":
                System.out.println("selasa");
                break;
            case  "3":
                System.out.println("rabu");
                break;
            case  "4":
                System.out.println("kamis");
                break;
            case  "5":
                System.out.println("jumat");
                break;
            case  "6":
                System.out.println("sabtu");
                break;
            case  "7":
                System.out.println("minggu");
                break;
            default:
                System.out.println("masukan nilai 1-7 saja");
        }
    }

}
