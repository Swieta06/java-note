package week1;

public class Pertemuan2 {
//overloading adalah method yang memiliki nama yg sama tp signature yang berbeda

    public static void main(String[] args) {
    printwithparam("boneka");
    printwthoutparam();
    int param = withParam(10,10);
        System.out.println(param);

    }

    public static void printwthoutparam() {
        System.out.println("hello world!");

    }

    public static void printwithparam(String text) {
        System.out.println("helo with"+text);
    }
    public static int withParam(int x,int y){
        return x+y;
    }

}
