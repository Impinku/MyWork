package Practice;

public class ArmstrongNumber {
    //153=(1*1*1)+(5*5*5)+(3*3*3)
    static void armstrong(int num){
        char [] ch=String.valueOf(num).toCharArray();
        System.out.println(ch);
        int sum=0;
        for(char n:ch){
            int k=n - '0';
            System.out.println(k);
            sum=sum+(k*k*k);
        }
System.out.println(sum);
        if(sum==num){
            System.out.println("Number is Armsrong Number");
        }
    }
    public static void main(String [] args){
        armstrong(127);
    }
}
