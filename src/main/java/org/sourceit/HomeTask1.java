package org.sourceit;

public class HomeTask1 {


    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
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
        if(a <= 0 || b <=0){
            return 0;
        }
        return Math.sqrt(a*a + b*b);
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
        if(a <= 0 || b <= 0 || c <= 0 ){
            return perimetrTriangle;
        }
        perimetrTriangle = a + b + c;
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
        if(a <= 0 || b <= 0){
            return 0;
        }
        double c = Math.sqrt(a * a + b * b);
        double semiPer = (a + b + c) / 2;
        return Math.sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));
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
        long sum = 0;
        if(number < 0){
            number *= -1;
        }
        while(number != 0){
            sum += (number % 10);
            number /= 10;
        }
        return sum;
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
        int fibValue = 1;
        int firstValue = 1;
        int secondValue = 1;
        while(till > 1){
            fibValue = secondValue + firstValue;
            firstValue = secondValue;
            secondValue = fibValue;
            --till;
        }
        return fibValue;
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
        if(ticket < 1 || ticket > 999999){
            return false;
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int a = 0; a < 3; a++) {
            rightSum += (ticket % 10);
            ticket /= 10;
        }
        for (int a = 0; a < 3; a++) {
            leftSum += (ticket % 10);
            ticket /= 10;
        }
        return leftSum == rightSum;
        }


    public static void main(String[] args) {
        long number = -1234L;
        double a = 3;
        double b = 4;
        double c = findHypotenuse(a, b);
        int min = 3;
        int max = 5;
        int till = 2;
        long ticket = 999999;

//        System.out.println("Число " + number + " четное " + isEven(number));
        System.out.println("При катетах " + a +" и "+ b + " гипотенуза равна " + findHypotenuse(a, b));
        System.out.println("Периметр треугольника равен " + perimeter(a, b, c));
        System.out.println("Площадь треугольника равна " + area(3, 5));
        System.out.println(generateNumberFromRange(min, max) + " случайное число в диапазоне " + min + " - " + max);
        System.out.println("Cумма цифр числа = " + calculateSum(number));
        System.out.println("Элемент последовательности " + fibonacci(till));
        System.out.println("Билет счастливый " + isHappy(ticket));
    }
}
