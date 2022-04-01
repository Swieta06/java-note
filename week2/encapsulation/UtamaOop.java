package week2.encapsulation;


import week2.encapsulation.OrientedProgramming;

public class UtamaOop {
    public static void main(String[] args) {
        OrientedProgramming oop =new OrientedProgramming("tes",20);
        //start encapsulasi
        //no argument construc
        OrientedProgramming oop1 =new OrientedProgramming();
        System.out.println(oop.getNama());
        System.out.println(oop.getUsia());

        oop1.setNama("nama");
        oop1.setUsia(20);
        System.out.println("oop1.getnama = "+oop1.getNama());
        System.out.println("oop1.getusia = "+oop1.getUsia());
        //end encapsulasi
    }
}
