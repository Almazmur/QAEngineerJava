import java.util.Arrays;

public class Exercises {
    /**
     * 1. Создайте метод printThreeWords(), который при вызове
     * должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    /**
     * 2. Создайте метод checkSumSign(), в теле которого объявите
     * две int переменные а и b, и инициализируйте их любыми
     * значениями, которыми захотите. Далее метод должен
     * просуммировать эти переменные, и если их сумма больше
     * или равна 0, то вывести в консоль сообщение "Сумма
     * положительная", в противном случае - "Сумма
     * отрицательная";
     */

    public void checkSumSign() {
        int a = 3;
        int b = 5;

        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /**
     * 3. Создайте метод printColor() в теле которого задайте int
     * переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод
     * должен вывести сообщение "Красный", если лежит в пределах
     * от 0 (0 исключительно) до 100 (100 включительно), то
     * "Желтый", если больше 100 (100 исключительно) "Зеленый";
     */

    public void printColor() {
        int value = 55;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


    /**
     * 4. Создайте метод compareNumbers(), в теле которого
     * объявите две int переменные а и b, и инициализируйте их
     * любыми значениями, которыми захотите. Если а больше или
     * равно b, то необходимо вывести в консоль сообщение "а >=
     * b", в противном случае "а < b";
     */
    public void compareNumbers() {
        int a = 33;
        int b = 9;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


    /**
     * 5. Напишите метод, принимающий на вход два целых числа и
     * проверяющий, что их сумма лежит в пределах от 10 до 20
     * (включительно), если да - вернуть true, в противном случае -
     * false.
     */
    public boolean isSumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }


    /**
     * 6. Напишите метод которому в качестве параметра передается
     * целое число, метод должен напечатать консоль, положительное
     * ли число передали или отрицательное. Замечание: ноль считаем
     * положительным числом.
     */
    public void printNumberSign(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }

    }


    /**
     * 7. Напишите метод которому в качестве параметра передается
     * целое число. Метод должен вернуть true, если число
     * отрицательное, и вернуть false если положительное.
     * Замечание: ноль считаем положительным числом.
     */
    public boolean isNegative(int a) {
        return a < 0;
    }


    /**
     * 8. Напишите метод, которому в качестве аргументов
     * передается строка и число, метод должен отпечатать в
     * консоль указанную строку, указанное количество раз;
     */
    public static void printStringCount(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }


    /**
     * 9.Напишите метод, который
     * определяет, является ли год
     * високосным, и возвращает boolean (високосный - true, не
     * високосный - false). Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й - високосный.
     */
    public static boolean leapYearIsNot(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }


    /**
     * 10. Задать целочисленный массив, состоящий из элементов
     * и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
     * условия заменить 0 на 1, 1 на 0;
     */
    public static int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }


    /**
     * 11. Задать пустой целочисленный массив длиной 100. С
     * помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8
     * 100;
     */
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }


    /**
     * 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по
     * нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static int[] multiplyIfLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }


    /**
     * 13. Создать квадратный двумерный целочисленный массив
     * (количество строк и столбцов одинаковое), и с помощью
     * цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по
     * следующему принципу: индексы таких элементов равны, то
     * есть [O][0], [1][1], [2][2], , [n][n];
     */
    public static int[][] fillDiagonal(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        return array;
    }


    /**
     * 14. Написать метод, принимающий на вход два аргумента: len и
     * initialValue, и возвращающий одномерный массив типа int длиной
     * len, каждая ячейка которого равна initialValue.
     */
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}










