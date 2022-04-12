package LogicTest;

import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        int sum=0;
        Scanner a = new Scanner(System.in);
        System.out.print("Input the number of members in the family\n" +
                "(separated by a space) : ");
        String sampleString=a.nextLine();

        String[] stringArrays=sampleString.split(" ");
        int[] intArr=new int[stringArrays.length];
        for (int i=0;i<stringArrays.length;i++){
            String numberAstring=stringArrays[i];
            intArr[i]=Integer.parseInt(numberAstring);
           // System.out.println(intArr[i]);
            sum = sum + intArr[i];
            //System.out.println(sum);
        }

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
