package week1;

public class arrayBasic {
    public static void main(String[] args) {
        int v1=1;
        int[] value = new int[100];//0-99
        value[0]=1;
        value[1]=2;
        value[2]=3;
        value[99]=100;
        System.out.println("value[0] ="+value[0]);
        System.out.println("value[99] ="+value[99]);

        int[] grade ={1,2,3};
        System.out.println("grade[0]=" + grade[0]);
    //modulus:sisa bagi
        int r =5%3;
        System.out.println(r);

        int a=1;
        int b=2;
        //a =a+b;
            a+=b;
        System.out.println("a : "+a);

        //prepost increment
        int t=1;
        int u=t++;
        int v=++t;
        System.out.println("t :"+t);
        System.out.println("u : "+u);
        System.out.println("v : "+v);
    }

}
