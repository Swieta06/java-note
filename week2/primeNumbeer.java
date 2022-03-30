package week2;

public class primeNumbeer {
    public static void main(String[] args) {

            ex2();
    }
    public  static  void  ex2(){
        int p=1;
        while (p>6){
            int q=1;
            while (q<6){
                q+=p;
                p++;
                System.out.println(p+" "+q);
            }
        }
    }
    public static void ex1(){
        int bil;
        for (int i=0; i<=100; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
}
