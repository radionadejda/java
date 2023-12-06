package Task04LinkedList;

import java.util.*;

import static Task04LinkedList.Task04LinkedList.removeEven;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        removeEven(list);
        System.out.println(list);
    }
}