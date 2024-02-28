package Practice;

import java.util.*;

public class GetKeyOfLeastOccurance {
    public static void main(String [] args){
        String vrr="This apple is sweet This apple is sour";
        String [] str=vrr.toLowerCase(Locale.ROOT).split(" ");
        System.out.println("Total word counts :"+ str.length);
        HashMap<String,Integer> wordCounts=new HashMap<String, Integer>();
        for(int i=0;i< str.length;i++){
            if(wordCounts.containsKey(str[i])){
                wordCounts.put(str[i],wordCounts.get(str[i])+1);
            }else{
                wordCounts.put(str[i],1);
            }
        }
        ArrayList<Integer> counts= new ArrayList<Integer>();
        for (Map.Entry entry:wordCounts.entrySet()){
            counts.add(Integer.parseInt(entry.getValue().toString()));

        }
        System.out.println("Map"+wordCounts);
        System.out.println("Counts"+counts);
        Collections.sort(counts);
        System.out.println("Counts after"+counts);
        System.out.println("Counts after sort"+counts.get(0));
        for (Map.Entry entry:wordCounts.entrySet()){
            if(counts.get(0)==entry.getValue()){
                System.out.print(entry.getKey());
            }

        }

    }
}
