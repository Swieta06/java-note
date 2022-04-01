package week2.trashCode;

public class Main {
    public static void main(String[] args) {
    Dog myDog[] = new Dog[3];
    myDog[0]= new Dog("spike",2);
    myDog[1]= new Dog("spike2",2);
    myDog[2]= new Dog("spike3",2);
        //System.out.println(myDog);
        for (int i=0;i<myDog.length;i++){
            System.out.print(" "+myDog[i].pets());
            System.out.println(" "+myDog[i].ages());
        }

    }
}
