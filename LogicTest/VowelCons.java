package LogicTest;

import java.util.Scanner;

public class VowelCons {
    static String deletKons(String teks){

        return teks.replaceAll("[bBcCdDfFgGhHjJkKlLmMnNpPqQrRsStTvVwWxXyYzZ ]", "");

    }

    static String deletVowel(String teks){
        String newTeks="";
        for (int i=0;i<teks.length();i++){
            if(teks.charAt(i)!='a'&&teks.charAt(i)!='A'&&
                    teks.charAt(i)!='i'&&teks.charAt(i)!='I'&&
                    teks.charAt(i)!='u'&&teks.charAt(i)!='U'&&
                    teks.charAt(i)!='e'&&teks.charAt(i)!='E'&&
                    teks.charAt(i)!=' '&&teks.charAt(i)!=' '&&
                    teks.charAt(i)!='o'&&teks.charAt(i)!='O'

            ){
                newTeks+=teks.charAt(i);
            }

        }
        return newTeks;

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String input;
        System.out.print("Input one line of words(S) : ");
        input= scan.nextLine();
        System.out.println("Vowel Characters : "+"\n"+deletKons(input).toLowerCase());
        System.out.println("Consonant Characters : "+"\n"+ deletVowel(input).toLowerCase());

    }
}
