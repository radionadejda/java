//Даны переменные b = 50, c = 20.
// Увеличьте b на 1, затем уменьшите c на 1,
// используя унарные операции.
// Выведите на экран проверку условия:
// b больше либо равно 51 **или** с меньше 22,
// используя логическую операцию.

public class Task7 {
    public static void main(String[] args) {
        int b = 50;
        int c = 20;
        b++;
        c--;

        boolean check = (b >= 51) || (c < 22);

        System.out.println("Is b more or equals 51 or is c less than 22? " + check);
    }
}
