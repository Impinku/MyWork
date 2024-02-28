package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String args[]){
        int[] Num={1,2,3,4,2,3,1};
        Set<Integer> seeet=new HashSet<>();
        for(int a:Num) {
            seeet.add(a);
        }
        int [] nnuuuu=new int[seeet.size()];
        for(Integer s:seeet){
     for(int j=0;j<seeet.size();j++){
         nnuuuu[j]= s.intValue();
     }}

    }
}
