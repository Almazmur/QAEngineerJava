package lesson5.task2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Сircle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Коричневый");

        System.out.println("Характеристики круга:");
        circle.printCharacteristics();

        System.out.println("Характеристики прямоугольника:");
        rectangle.printCharacteristics();

        System.out.println("Характеристики треугольника:");
        triangle.printCharacteristics();
    }
}
