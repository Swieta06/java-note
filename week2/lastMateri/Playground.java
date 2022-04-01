package week2.lastMateri;

import java.util.ArrayList;
import java.util.List;

public class Playground {
    //list,set,map
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("str1");
        listString.add("str2");
        listString.add("blabla");
        System.out.println(listString);
        System.out.println(listString.size());
        //mengambil element
       //System.out.println(listString.get(0));
       // System.out.println(listString.get(1));
        for (int i=0;i< listString.size();i++){
            //get(i) ambil semua nilai array
            System.out.println(listString.get(i));
        }

        //class student
        Student student1=new Student("swieta ",1);
        Student student2=new Student("wita ",2);
        Student student3=new Student("swita ",3);
        Student student4=new Student("swita ",4);

        List<Student>studentList=new ArrayList<>();
        List<Student>studentList1=new ArrayList<>();
        studentList1.add(student4);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.addAll(studentList1);
        //apdate
        studentList.set(1,student1);
        //remove
        studentList.remove(1);

        //listString.add(1, student4);

        for (Student murid:studentList) {
            System.out.println(murid.getAge()+" "+murid.getNama());
           // System.out.println(studentList.size());
        }

//Animal chicken=new Chicken();

    }
}
