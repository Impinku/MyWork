package Practice;

public class ReverseYourName {
    static void  nameRev(String name){
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){

        }
    }
    public static void main(String [] args){
        String name="Shiba Prasad Rout";
        String resultnn="";
        for(int i=name.length()-1; i>=0; i--) {
            resultnn = resultnn + name.charAt(i);
        }
        System.out.println(resultnn);

        nameRev(name);
    }
}
