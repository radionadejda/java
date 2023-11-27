package Task01Temperature;
import java.util.Scanner;
public class Temperature {
    public static void main (String [] args) {
        Scanner inputTemperature = new Scanner(System.in);
        System.out.print("Введите температуру целым числом: ");

        int temperature = inputTemperature.nextInt();
        if (temperature < 0) {
            System.out.println("Сейчас очень холодно");
        }
        else if (temperature <= 16) {
            System.out.println("Сейчас прохладно");
        }
        else if (temperature <= 28) {
            System.out.println("Отличный летний денек!");
        }
        else {
            System.out.println("вот это жара, я таю!");
        }
    }
}
