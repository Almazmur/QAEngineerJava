package lesson6;

import static lesson6.ArraySum.sumArray;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                { "1", "2", "5", "6"},
                {"7", "4", "3", "9"},
                {"3", "1", "6", "4"},
                {"75", "64", "88", "31"}
        };


        String[][] wrongArray = {
                { "1", "2", "5", "6"},
                {"7", "4", "3", "9"},
                {"3", "1", "6", "4"},
        };


        String[][] dataErrorArray = {
                { "1", "2", "5", "6"},
                {"7", "6", "3", "9"},
                {"3", "one", "6", "4"},
                {"75", "64", "88", "31"}
        };


        String[][] unevenRowArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println("Сумма элементов correctArray: " + sumArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов wrongArray: " + sumArray(wrongArray));
        }catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов dataErrorArray: " + sumArray(dataErrorArray));
        }catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов problematicArray: " + sumArray(unevenRowArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
