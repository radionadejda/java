package Task03Map;

import java.util.*;

public class Task03Map {
    public static void countChars (String string) {
        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();
        for (char character : string.toCharArray()) {
            if(charCounts.containsKey(character)){
                charCounts.put(character, charCounts.get(character)+1);
            } else {
                charCounts.put(character, 1);
            }
        }
        for (char character : charCounts.keySet()) {
            System.out.println(character + " - " + charCounts.get(character));
        }
    }

}
