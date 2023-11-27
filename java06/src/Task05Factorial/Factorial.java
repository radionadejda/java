package Task05Factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("input a positive integer that is not larger than 31: ");
        int n = inputNumber.nextInt();
        if (n<0) {
            System.out.println("can't calculate factorial of negative number");
        } else if (n>31){
            System.out.println("this number is too large to calculate it's factorial");
        }
        else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *=i;
            }
            System.out.println("factorial of "+ n +" is "+factorial);
        }

    }
}