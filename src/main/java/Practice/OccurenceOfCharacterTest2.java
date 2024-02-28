package Practice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class OccurenceOfCharacterTest2 {

    static void occurence(String inputString){
        HashMap<Character,Integer> characterCountMap= new HashMap<Character,Integer>();
        char [] newStrii=inputString.toLowerCase(Locale.ROOT).toCharArray();
        for(int i=0;i<newStrii.length;i++){
            if(characterCountMap.containsKey(newStrii[i])){
                characterCountMap.put(newStrii[i],characterCountMap.get(newStrii[i])+1);
            }else{
                characterCountMap.put(newStrii[i],1);
            }
        }
        System.out.println(characterCountMap.size());
        for(int j=0;j<characterCountMap.size();j++){
           // System.out.println(characterCountMap.get());
        }
    }
    public static void main(String [] args){
    String str="Old Monks CC";
        occurence(str);
    }
}
