package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorOfStu {
    public static void main(String [] args){
        ArrayList<Studentss> arr=new ArrayList<Studentss>();
        arr.add(new Studentss("Raj",25,"First year"));
        arr.add(new Studentss("Ram",22,"second year"));
        arr.add(new Studentss("Rahul",23,"Third year"));
        nameComparison namecom=new nameComparison();
        Collections.sort(arr,namecom);

        for(Studentss ssss:arr){
        System.out.println(ssss.getAge()+"**"+ssss.getName()+"**"+ssss.getYear());
        }

        Collections.sort(arr);
        for(Studentss ssss:arr){
            System.out.println(ssss.getAge()+"**"+ssss.getName()+"**"+ssss.getYear());
        }
    }
}

class Studentss implements Comparable<Studentss>{
    private String name;
    private int age;
    private String year;

    public Studentss(String ss,int aa,String yy){
        this.name=ss;
        this.age=aa;
        this.year=yy;
    }
    @Override
    public int compareTo(Studentss o) {
        return this.age-o.age;

    }
    public String getName(){return name;}
    public int getAge(){return  age;}
    public String getYear(){return year;}
}
class nameComparison implements Comparator<Studentss>{

    @Override
    public int compare(Studentss o1, Studentss o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
