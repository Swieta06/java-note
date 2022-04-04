package Challenge_2;
import java.text.DecimalFormat;
import week1.Mean;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        mainn();

    }
    public static void mainn() throws IOException {

        Scanner k = new Scanner(System.in);
        int nilai[] = {7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 10, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 6, 7, 8, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 9, 9, 8};
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
        menu = k.nextInt();

        //output array
        //System.out.println("array sebelum di sorting= "+Arrays.toString(nilai));
        PrintWriter w = new PrintWriter(new FileWriter("C:\\TEMP\\direktori\\data_sekolah.txt"));
        Arrays.sort(nilai);
        //cetak ke file
        w.print(Arrays.toString(nilai));
        w.close();
        // System.out.println("setelah melakukan sorting");
        //System.out.println("setelah melakukan sorting"+Arrays.toString(nilai));
        // System.out.println("jumlah length nilai = "+nilai.length);

        switch (menu) {

            case 1:
            //modus

                int c=nilai[0];
                int b=0;
                int modus=0;int besar=0;
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
                //mean array
                double mean=sum/ 198.;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Mean = "+df.format(mean));

                //median data tunggal genap
                //((datake1)+(datake2))/2
                //data ke 1=198/2
                //data ke 2=199/2
                int n=198;
                int kn=198/2;
                double data2=199./2;
                double median=((kn)+(data2))/2;

                System.out.println("Median = "+median);

                break;
            case 3:
                System.out.println("Berikut hasil sebaran data nilai");
                BufferedReader mix = new BufferedReader(new FileReader("C:\\TEMP\\direktori\\hasil_data_nilai.txt"));
                String  mn= mix.readLine();
                String  md= mix.readLine();
                String  mds= mix.readLine();
                System.out.println(mn);
                System.out.println(md);
                System.out.println(mds);
                mix.close();
                break;
           case 0:
               System.exit(0);
                break;
            default:
                System.out.println("File tidak ditemukan");
                System.out.println("0. exit");
                System.out.println("1. kembali kemenu utama");
                Scanner choose=new Scanner(System.in);
                int a=choose.nextInt();

                if (a==1){
                    mainn();
                }else {
                    System.out.println("Exit Program");
                    break;
                }
        }


    }


}
