package Task01Arrays;

import java.util.Arrays;

import static Task01Arrays.Task01Arrays.removeDuplicates;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNumbers = {0,1,2,3,4,0,0,0,0,0};
        int[] result = removeDuplicates(numbers);

        System.out.println(Arrays.equals(result, expectedNumbers));
    }
}
