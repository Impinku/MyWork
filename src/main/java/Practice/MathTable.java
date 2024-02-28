package Practice;

public class MathTable {
    static void table(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num+"  "+i+"  "+(num*i));
        }
    }
    public static void main (String [] args){
        int num=17;
        table(num);
    }
}
