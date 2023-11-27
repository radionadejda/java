package Task02EvenOdd;
import java.util.Scanner;
public class EvenOrOddNumber {
    public static void main (String [] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = inputNumber.nextInt();
        String result = n%2 == 0 ? "вы ввели четное число" : "вы ввели нечетное число";
        System.out.println(result);
    }
}
