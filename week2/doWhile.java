package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) throws IOException {
        //  ex1();
        //  ex2();
        //ex3();
       /*Scanner  inputUser = new Scanner(System.in);
        System.out.println("masukan angka");
        int angka = inputUser.nextInt();
        System.out.println(ex5(angka));*/
//ex6();
        ex7("katak");
    }
    public static void ex1(){
        Scanner k=new Scanner(System.in);
        System.out.println("Mauskan nomor = ");
        int n =k.nextInt();
        do {
            System.out.println("n ="+n);
            System.out.println("Masukan nomor= ");
            n= k.nextInt();
        }while (n!=0);
        System.out.println("keluar");
    }
    public static void ex2() throws IOException {
        BufferedReader buf=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\week2\\doWhile.txt"));
        String test=buf.readLine();
        while (test != null){
            System.out.println(test);
            test = buf.readLine();

        }
    }
    public static void  ex3(){
        for (int i=1; i<10;i++){
            for (int j=1; j<10;j++){
                System.out.println(i +"*"+j+"="+i*j);
            }
        }
    }
    public static void ex4(){
        String awal;
        String dua;
        Scanner k=new Scanner(System.in);
        System.out.print("Enter string satu =");
        awal= k.nextLine();
        System.out.print("Enter string dua =");
        dua= k.nextLine();
        System.out.println(awal.concat(dua));
        System.out.println(dua.concat(awal));
    }
    public static int ex5(int angka){
        int jumlah =0;
        while (angka!=0){
            jumlah=jumlah+angka%10;
            angka=angka/10;
            if(angka %2 ==0){
               // angka+angka;
            }else {
                System.out.println("bilangan genap");
            }
        }
        return jumlah;
    }
    public static void ex6(){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Angka :");
        int jmlAngka = input.nextInt();
        int[]arr = new int[jmlAngka];
        System.out.println("Masukkan Semua Angka :");

        for(int i=0;i <jmlAngka;i++){
            arr[i] =input.nextInt();
        }

        Arrays.sort(arr);
        for(int index:arr){
            System.out.println("Telah diurutkan :"+index);/*mencetak elemen yang telah diurutkan*/
        }
    }
    public  static  void ex7(String teks){
        String poli = "";


        for(int i = teks.length(); i>0; i--){
            String test1 = teks.substring(i-1, i);
            poli += test1;
        }

        if(teks.equals(poli)){
            System.out.println(teks+" adalah Palindrome ");
        }else{
            System.out.println(teks+" bukan Palindrome ");
        }
    }


}
