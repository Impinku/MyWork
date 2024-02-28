package Practice;

public class SortAStringWithoutUsing {
    public static void main(String[] args) {
        String name = "abhbhaahb";
        //O/p- aaabbbhhh
        char temp;
        char[] st = name.toCharArray();
        for (int i = 0; i < name.length() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (st[j] < st[j - 1]) {

                    temp = st[j - 1];
                    st[j - 1] = st[j];
                    st[j] = temp;


                }

            }

        }
        System.out.println(String.valueOf(st));
    }
}
