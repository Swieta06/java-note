package week1;

import java.util.Locale;

public class StringPlayground {
    public static void main(String[] args) {
        String nama = " Swieta";
        String buah = "aple";
        System.out.println("nama sayaa " + nama.trim());
        //(java string built in methode)
        //.trim untuk membersihkan spasi
        //length menghitung jumlah valuenya
        //concate untuk menggabungkan
        System.out.println("nama lengkap saya: " + nama.trim().length());
        System.out.println("saya suka ".concat(buah));
        System.out.println(nama.toLowerCase());
    }

}
