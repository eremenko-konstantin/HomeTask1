package org.sourceit;

public class HomeTask1 {


    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b) {
        if(a <= 0){
            return 0;
        }
        else{
            if(b <= 0){
                return 0;
            }
            else{
                return Math.sqrt(a*a + b*b);
            }
        }
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        double perimetrTriangle = 0;
        perimetrTriangle = a <= 0 ? 0 :
                (b <= 0 ? 0 :
                        (c <= 0 ? 0 :
                                (a + b + c)));
        return perimetrTriangle;
    }

    /**
     * Метод находит площадь прямоугольного треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {
        if(a <= 0){
            return 0;
        }
        else{
            if(b <= 0){
                return 0;
            }
            else{
                double semiperimeter = perimeter(a, b, findHypotenuse(a, b))/2;
                return (semiperimeter - a) * (semiperimeter - b);
            }
        }


    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        return 0;

    }


    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {
        return 0;

    }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        return false;

    }

    public static void main(String[] args) {
        int number = 9;

        double a = 3;
        double b = 4;
        double c = findHypotenuse(a, b);

        int min = 3;
        int max = 5;

        System.out.println("Число " + number + " четное " + isEven(number));
        System.out.println();
        System.out.println("При катетах " + a +" и "+ b + " гипотенуза равна " + findHypotenuse(a, b));
        System.out.println("Периметр треугольника равен " + perimeter(a, b, c));
        System.out.println("Площадь треугольника равна " + area(a, b));
        System.out.println();
        System.out.println(generateNumberFromRange(min, max) + " случайное число в диапазоне " + min + " - " + max);

    }
}
