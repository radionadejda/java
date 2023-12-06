package Task01Arrays;
public class Task01Arrays {
    public static int[] removeDuplicates(int[] numbers) {
        int addIndex = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
//            System.out.println("first loop go "+ i);
            if (numbers[i] < numbers[i + 1]) {
                numbers[addIndex] = numbers[i + 1];
//                System.out.println("put "+ numbers[i+1]+" at "+addIndex);
                addIndex++;
            }
        }

        // after that int[] numbers = {0,1,2,3,4,2,2,3,3,4};
        // and addIndex = 5;

        for (int i = addIndex; i < numbers.length; i++) {
            numbers[addIndex] = 0;
//            System.out.println("second loop "+ addIndex);
            addIndex++;
        }

        return numbers;
    }
}
