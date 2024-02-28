package Practice;

import java.util.ArrayList;
import java.util.Locale;

public class OccurenceAndReplaceSecondiWithK {
    //occurrence on i and replace second i with #
    public static void main(String [] args){
        String sentence="I am in sapient interview";
        String lowercaseString=sentence.toLowerCase(Locale.ROOT);
        char [] ch=sentence.toLowerCase(Locale.ROOT).toCharArray();
        ArrayList<Character> arrr=new ArrayList<Character>();
        int count= 0;
        int count1= 0;
        for(char c:ch){
            if(c=='i'){
                count++;
            }
        }
        System.out.println("Counts of i :"+count);
        System.out.println("Index of i :"+lowercaseString.indexOf('i'));
        for(char c:ch){
            if(c=='i'){
                count1++;
            }
            arrr.add(c);
            if(count1==2){
                break;
            }
        }
        int index= arrr.size();
        System.out.println("Index of second i is :"+index);
        String firstHalf=sentence.substring(0,index+1);
        System.out.println("***"+firstHalf+"***");
        String SecondHalf=sentence.substring(index+1,sentence.length());
        System.out.println("%%%"+SecondHalf+"%%%");
        String firstAfterReplacement=firstHalf.replace('i','#');
        System.out.println(firstAfterReplacement+SecondHalf);
    }

}
