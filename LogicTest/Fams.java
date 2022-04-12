package LogicTest;
import java.util.Scanner;

import static java.lang.System.err;

public class Fams {
    public static void main(String[] args) {

        int arry[],n ,sum = 0;
        arry=new int[10];


        Scanner input=new Scanner(System.in);
        System.out.print("Input the number Of families : ");
        n=input.nextInt();

        for (int i = 1; i<=n; i++){
                System.out.print("Input the number of members in the family\n" +
                        "(separated by a space) : ");
                arry[i] = input.nextInt();
                sum = sum + arry[i];

        }

        input.close();


        int hasil;
        if (sum%4==0){
              hasil  =sum/4;
                System.out.println("Minimum bus required is : "+hasil);

            }else {
                hasil =(sum/4)+1;
            System.out.println("Minimum bus required is : "+hasil);
            }

    }

}
