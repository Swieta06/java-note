package week2.lastMateri;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class sett {
    public static void main(String[] args) {
        //output dari set tidak berurutan
        Set<Student> studentSet=new HashSet<>();
        //Set<Student> studentSet2=new LinkedHashSet<>();
        studentSet.add(new Student("adam",20));
        studentSet.add(new Student("bibi",21));
        studentSet.add(new Student("cica",19));
        System.out.println(studentSet);

        Iterator<Student> it= studentSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
