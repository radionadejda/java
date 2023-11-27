//8. Дана строка «Training Java».
// Выведите на экран её длину и символ,
// который стоит на 5 позиции,
// а затем добавьте к ней строку
// с сегодняшним числом
// и выведите результат на экран.


public class Task8 {
    public static void main(String[] args) {
        String str1 = "Training Java";
        System.out.println("String length is " + str1.length() + " symbols");
        System.out.println("Symbol at position 5 is " + str1.charAt(5));
        String str2 = "to be awesome";
        System.out.println(str1+" "+str2);

    }
}
