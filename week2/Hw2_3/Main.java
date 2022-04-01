package week2.Hw2_3;

public class Main {
    public static void main(String[] args) {
        Animals animNames[]=new Animals[6];
        animNames[0]=new Animals("Dog",4,"Daging");
        animNames[1]=new Animals("Spider",8,"Serangga");
        animNames[2]=new Animals("Fly",0,"Kotoran");
        animNames[3]=new Animals("Centipede",100,"Daun");
        animNames[4]=new Animals("Snake",0,"Tikus");
        animNames[5]=new Animals("Chicken",2,"Kacang");
        //System.out.println(animNames);
       for (int i=0;i< animNames.length;i++){
           System.out.print("Nama Hewan = ");
            System.out.println(animNames[i].names());
           System.out.print("Jumlah Kaki = ");
            System.out.println(animNames[i].ages());
           System.out.print("Makanan Favorit = ");
            System.out.println(animNames[i].foods());
           System.out.println("====================");

        }
    }
}
