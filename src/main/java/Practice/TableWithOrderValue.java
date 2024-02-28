package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableWithOrderValue {
    // Raj,25,first year
    //Ram , 26,Decond year
    //Rahul,23,Third year
    public static void main(String [] args){
       ArrayList<Student> arr=new ArrayList<Student>();
       arr.add(new Student("Raj",25,"First year"));
        arr.add(new Student("Ram",26,"second year"));
        arr.add(new Student("Rahul",23,"Third year"));

        Collections.sort(arr);
        for(Student s:arr){
System.out.println(s.getAge()+"**"+s.getYear()+"**"+s.getName());
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String year;
    @Override
    public int compareTo(Student s){

        return this.age-s.age;
    }
    Student(String ss, int aa,String yy){
        this.name=ss;
        this.age=aa;
        this.year=yy;

    }
    public String getName(){return name;}
    public String getYear(){return year;}
    public int getAge(){return age;}

}
