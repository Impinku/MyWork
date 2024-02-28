package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurOfAcharacter2 {

    public static void main(String args[]) {
        String letter = "Lollapallaza";
        maxletOccurance(letter.toLowerCase());
    }
    private static void maxletOccurance(String letter){
        char ch[] = letter.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<=ch.length-1; i++){
            if(map.containsKey(ch[i])==false){
                map.put(ch[i],1);
            }else{
                int oldVal = map.get(ch[i]);
                int newVal = oldVal+1;
                map.put(ch[i],newVal);
            }
        }

        Set<Map.Entry<Character, Integer>> newMap = map.entrySet();
        char maxKey = ' ';
        int maxVal = 0;
        for(Map.Entry<Character,Integer> data : newMap){
            if(data.getValue()>maxVal){
                maxVal = data.getValue();
                maxKey = data.getKey();
            }
        }
        System.out.print(maxKey);
        System.out.println(" " + maxVal);
    }
}
