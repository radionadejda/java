//3. Присвойте переменной типа char букву ‘ы’
// тремя разными способами.
// Выведите значение на экран.
// Подсказка: воспользуйтесь таблицей UTF-8,
// ссылка на которую приведена в данной главе.

public class Task3 {
    public static void main(String[] args) {
        char charVar1 = 'Ы';
        System.out.println(charVar1);
        char charVar2 = 1067;
        System.out.println(charVar2);
        char charVar3 = '\u042B';
        System.out.println(charVar3);
    }

}
