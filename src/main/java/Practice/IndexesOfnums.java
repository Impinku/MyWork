package Practice;

public class IndexesOfnums {
        /* Given an array of integers "nums" and an integer target,
        return indexes of the two numbers so that they add up to target.  Input: nums = [2,11,7,15], target = 9
         Output: [0,2]*/
        public static void main(String [] args){
            int [] str={2,11,7,15};
            for(int i=0;i< str.length;i++){
                for(int j=i+1;j< str.length;j++){
                    if(str[i]+str[j]==9){
                        System.out.println("indexes are :"+i+" "+j);
                    }
                }
            }

        }
    }
