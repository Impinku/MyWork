package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AsscendingOrderWithoutSort {
    public static void main(String args[]){
        int [] arr={8,9,25,1,1,7,7,13,3};
        int [] sort=new int[arr.length];
       for (int i=0;i< arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
int min=0;
if(arr[i]>arr[j]){
min=arr[i];
arr[i]=arr[j];
arr[j]=min;
}
           }
       }
System.out.println(Arrays.toString(arr));
    }
}
