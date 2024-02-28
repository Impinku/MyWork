package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMovie {
    public static void main(String [] args){
        ArrayList<Movie> arr= new ArrayList<Movie>();
        arr.add(new Movie(4.5,"Rockstar",2011));
        arr.add(new Movie(3.2,"Zumanji",2005));
        arr.add(new Movie(2.2,"Fly",2016));
        Collections.sort(arr);
        System.out.println("movie names after listing");

        for(Movie v:arr){
System.out.println(v.getRating()+" **"+v.getMoviename()+"**"+v.getYear());
        }
    }
}


class Movie implements Comparable<Movie>{

    private double rating;
    private String moviename;
    private int year;

    @Override
    public int compareTo(Movie m) {
        return this.year-m.year;
        //return this.rating-m.rating;
    }
    Movie(double dd,String nm,int yy){
        this.rating=dd;
        this.moviename=nm;
        this.year=yy;
    }

    public double getRating(){return rating;}
    public String getMoviename(){return moviename;}
    public int getYear(){return year;}
}
