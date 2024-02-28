package Practice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class OccurancesOfWordsInASentence {
    static void occuranceWord(String str) {
        String[] strr2 = str.toLowerCase(Locale.ROOT).split(" ");
        HashMap<String, Integer> mapOcuur = new HashMap<String, Integer>();
        for (String s : strr2) {
            if (mapOcuur.containsKey(s)) {
                mapOcuur.put(s, mapOcuur.get(s) + 1);
            } else {
                mapOcuur.put(s, 1);
            }
        }
        for (Map.Entry entry : mapOcuur.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        occuranceWord("Dog is eating dog food");
    }
}
