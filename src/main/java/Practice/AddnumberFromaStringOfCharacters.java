package Practice;

public class AddnumberFromaStringOfCharacters {
    public static void main(String [] args){
        String str="*&^&675**&^3456*&$%6656";
        int sum=0;
        String [] parts=str.split("\\D+");
        for(String s:parts){
            if(!s.isEmpty()){
                sum=sum+Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
