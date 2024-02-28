package Practice;

import java.util.ArrayList;

public class RemoveWhiteSpace {
    public static void main(String [] args){
        String name=" My Name is Shiba ";
        String namme=name.split(" ",0)[1];
        System.out.println("**"+namme+"**");
        String[] arrOfStr=namme.split(" ");
        String str="";
        for(int i=0;i<arrOfStr.length;i++){
            str= str+arrOfStr[i];
            if(i< arrOfStr.length-1){
                str=str+" ";
            }
        }
        System.out.println("**"+str+"**");

    }
}
