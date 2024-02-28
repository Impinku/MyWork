package Practice;
import java.io.*;
import java.util.*;
import java.util.HashMap;

public class OccurenceOfCharacter {

    static void occurence(String inputString){
        HashMap<Character,Integer> characterCountMap= new HashMap<Character,Integer>();
        char [] newStrii=inputString.toLowerCase(Locale.ROOT).toCharArray();
        for(char c:newStrii){
            if(characterCountMap.containsKey(c)){
                characterCountMap.put(c,characterCountMap.get(c)+1);
            }else{
                characterCountMap.put(c,1);
            }
        }
        for (Map.Entry entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String [] args){
    String str="Old Monks CC";
        occurence(str);
    }
}
