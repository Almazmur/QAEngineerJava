
public class Main {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        //task1
        exercises.printThreeWords();

        //task2
        exercises.checkSumSign();

        //task3
        exercises.printColor();

        //task4
        exercises.compareNumbers();

        //task5
        exercises.isSumInRange(10, 2);

        //task6
        exercises.printNumberSign(-1);

        //task7
        exercises.isNegative(0);

        //task8
        exercises.printStringCount("Hello World!", 5);

        //task9
        exercises.isLeapYear(1993);

        //task10
        exercises.invertArray(new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 });

        //task11
        exercises.fillArray();
        for (int value : exercises.fillArray()) {
            System.out.println(value + " ");
        }


        //task12
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] modifiedArray = exercises.multiplyIfLessThanSix(array);

        for (int value : modifiedArray) {
            System.out.println(value + " ");
        }


        //task13
        int size = 5;
        int[][] diagonalArray = exercises.fillDiagonal(size);
        System.out.println("Diagonal Array:");
        for (int[] row : diagonalArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


        //task14
        int len = 10;
        int initialValue = 7;
        int[] createdArray = exercises.createArray(len, initialValue);

        System.out.println("Created Array:");
        for (int value : createdArray) {
            System.out.print(value + " ");
        }

    }
}