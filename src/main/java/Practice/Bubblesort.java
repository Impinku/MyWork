package Practice;

public class Bubblesort {
    public static void main(String [] args){
        int [] arr={6,3,0,5};
        int temp;
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapped=true;

                }

            }
            if (!swapped)
                break;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
