package Task04LinkedList;

import java.util.*;

public class Task04LinkedList {
    public static void removeEven(LinkedList<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
    }
}
