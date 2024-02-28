package Practice;

import java.util.*;

public class MaximumOccuranceOfaCharacter {
    static  void maximumOccurance(String words){
        HashMap<Character,Integer> occurance=new HashMap<Character,Integer>();
        char [] st=words.toLowerCase(Locale.ROOT).toCharArray();
        for(int i=0;i< st.length;i++){
            if(occurance.containsKey(st[i])){
                occurance.put(st[i],occurance.get(st[i])+1);
            }else{
                occurance.put(st[i],1);
            }
        }
        for(Map.Entry entry:occurance.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        ArrayList<Integer> values=new ArrayList<Integer>();
        for(Map.Entry entry2:occurance.entrySet()){
            values.add(Integer.parseInt(entry2.getValue().toString()));
        }
        Integer hhy = Collections.max(values);
        System.out.println(hhy);
        for(Map.Entry entry3:occurance.entrySet()){
            if(entry3.getValue()==hhy){
                System.out.println("Maximum Occurance of a character :"+entry3.getKey());
            }
        }
    }
    public static void main(String [] args){
        maximumOccurance("java");
    }
}
