import java.util.*;

public class KingXNewBaby {
    public String isValid(String name) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        HashMap<String, Integer> vowelCount = new HashMap<String, Integer>();
        int c = 0;
        if (name.length() != 8) {
            return "NO";
        } else {

            for (String vowel : vowels) {
                int i = name.indexOf(vowel);
                while (i >= 0) {
                    name = name.substring(i + 1);
                    i = name.indexOf(vowel);
                    c++;
                    if (vowelCount.containsKey(vowel)) {
                        vowelCount.put(vowel, vowelCount.get(vowel) + 1);
                    } else {
                        vowelCount.put(vowel, 1);
                    }
                }
            }
        }
        if (c > 2) {
            return "NO";
        } else {
            for (String key : vowelCount.keySet()) {
                if (vowelCount.get(key) == 2) {
                    return "YES";
                }
            }
        }

        return "NO";
    }
}
