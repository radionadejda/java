//Решите задачу с помощью программы.
// Известны катеты прямоугольного треугольника:
// основание = 5, боковая сторона = 8,
// найдите его площадь и периметр и выведите на экран.
//
//Подсказка: понадобятся формулы для периметра
// и площади прямоугольного треугольника.

// Периметр больше 15? Площадь меньше 30?
// Выясните это в программе и выведите результат на экран.

public class Task6 {
    public static void main(String[] args) {
        double base = 5;
        double side = 8;
        double area = (base*side)/2;
        System.out.println("Area is " + area);

        boolean areaCheck = area < 30;
        System.out.println("Is area less than 30? " + areaCheck);

        double hypotenuse = Math.round(Math.sqrt(Math.pow(base,2)+Math.pow(side,2)));
        double perimeter = base+side+hypotenuse;
        System.out.println("Perimeter is about " + perimeter);

        boolean perimeterCheck = perimeter > 15;
        System.out.println("Is perimeter more than 15? " + perimeterCheck);
    }
}
