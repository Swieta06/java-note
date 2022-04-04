package week2.trashCode;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class main {
    public static void main(String[] args) throws IOException {
        Scanner k=new Scanner(System.in);
        int nilai[]={7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,5,6,7,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,6,7,8,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,9,9,8};
        int menu,modus ;
        System.out.println("Tampilan menu utama");
        System.out.println("------------------------");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("------------------------");

        System.out.println("1. Generate txt untuk menamilkan modus");
        System.out.println("2. Generate txt untuk menampilkan rata-rata, median");
        System.out.println("3. Generate kedua file");
        System.out.println("0. Exit");
        System.out.print("Pilih menu : ");
        menu=k.nextInt();


        //output array
        //System.out.println(Arrays.toString(nilai));
        PrintWriter w =new PrintWriter(new FileWriter("C:\\TEMP\\direktori\\tes.txt"));
        Arrays.sort(nilai);
        //cetak ke file
        w.print(Arrays.toString(nilai));
        w.close();
        // System.out.println("setelah melakukan sorting");
        BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\Challenge_2\\tes.txt"));

        //System.out.println(Arrays.toString(nilai));
        // System.out.println(nilai.length);
        //end array


        read.close();


        //System.out.print(menu);
        switch (menu) {
            case 1:
                int c=nilai[0];
                int b=0;
                modus=0;int besar=0;
                for (int i=0; i<nilai.length ;i++){
                    if(nilai[i]==c){
                        System.out.print(nilai[i]+" ");
                        System.out.println(++b);
                        if(b>besar){
                            besar=b;
                            modus=c;
                        }
                    }else{
                        c=nilai[i];
                        b=1;
                        System.out.print(nilai[i]+" ");
                        System.out.println(b);
                    }
                }
                System.out.println("Modus = "+modus);
                break;

            case 2:
                //rumus mean
                int sum = 0;
                //penjumlahan seluruh array
                for( int num : nilai) {
                    sum = sum+num;

                }
                double mean=sum/198.;
                //mean array
                System.out.println("Mean = "+mean);

                //median data tunggal genap
                //((datake1)+(datake2))/2
                //data ke 1=198/2
                //data ke 2=199/2
                int n=198;
                int kn=198/2;
                double data2=199./2;
                double median=((kn)+(data2))/2;
                //System.out.println("array [99] = "+nilai[99]);
                //System.out.println("array [98] = "+nilai[98]);
                //System.out.println("array [97] = "+nilai[97]);
                //System.out.println("median bagi 2 = "+kn);
                //System.out.println("data ke 2 bagi dua = "+data2);
                System.out.println("Median = "+median);
                break;
            case 3:
                System.out.println("Berikut hasil sebaran data nilai");

                break;
        }






    }public static void medianMean() throws IOException {



    }
    public static void Shorting() throws IOException {
        int nilai[]={7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,5,6,7,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,6,7,8,7,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,10,10,10,10,10,7,7,9,9,8};
        //output array
        System.out.println(Arrays.toString(nilai));
        PrintWriter w =new PrintWriter(new FileWriter("C:\\TEMP\\direktori\\tes.txt"));
        Arrays.sort(nilai);
        //cetak ke file
        w.print(Arrays.toString(nilai));
        w.close();
        System.out.println("setelah melakukan sorting");
        BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\Challenge_2\\tes.txt"));
        // int a =Integer.parseInt(read.readLine());
        System.out.println(Arrays.toString(nilai));
        System.out.println(nilai.length);

        //modus
        read.close();

    }
    public static void kelasA() throws IOException {
        String[] kelasA=new  String[3];
        Scanner k=new Scanner(System.in);
        System.out.println("input kelas A");

        for( int i =0 ; i < kelasA.length; i++ ){
            System.out.print("Nilai ke-" + i + ": ");
            kelasA[i] = k.nextLine();
        }
        for( String b : kelasA ){
            System.out.print(b);
            PrintWriter w =new PrintWriter(new FileWriter("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\Challenge_2\\test.txt"));
            w.print(Arrays.toString(kelasA));
            w.close();
            BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\Challenge_2\\test.txt"));
            String kelas= read.readLine();
            System.out.println(Arrays.toString(kelasA));

        }
    }
    public static void menu() throws IOException {
        Scanner k=new Scanner(System.in);
        int menu;
        System.out.println("Tampilan menu utama");
        System.out.println("------------------------");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("------------------------");

        System.out.println("1. Generate txt untuk menamilkan modus");
        System.out.println("2. Generate txt untuk menampilkan rata-rata, median");
        System.out.println("3. Generate kedua file");
        System.out.println("0. Exit");
        System.out.print("Pilih menu : ");
        menu=k.nextInt();
        System.out.print(menu);
        switch (menu) {
            case 1:
                Shorting();
                break;
        }
    }
    public static void reader() throws IOException {
        BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\swieta\\IdeaProjects\\Latihan\\src\\Challenge_2\\data_sekolah.txt"));
        String kelasA = read.readLine();
       /* String kelasB= read.readLine();
        String kelasC= read.readLine();
        String kelasD= read.readLine();
        String kelasE= read.readLine();
        String kelasF= read.readLine();
        String kelasG= read.readLine();
        String kelasH= read.readLine();*/
        System.out.println(kelasA);

        /*System.out.println(kelasB);
        System.out.println(kelasC);
        System.out.println(kelasD);
        System.out.println(kelasE);
        System.out.println(kelasF);
        System.out.println(kelasG);
        System.out.println(kelasH);
       // System.out.println("test length " +kelasA.le);
        //for (int i=0;i<kelasA.;i++){
            //System.out.println(kelasA[i]);
        //}*/
        read.close();
    }

}

