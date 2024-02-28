package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AsscendingOrder {
    public static void main(String args[]){
        int [] arr={8,9,25,1,7,13,3};
        ArrayList<Integer> arraag=new ArrayList<Integer>();
        for(int s:arr){
            arraag.add(s);
        }
        Collections.sort(arraag);
        for(int n:arraag) {
            System.out.print(n+" ");
        }

    }
}
