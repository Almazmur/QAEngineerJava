package lesson5.task2;

public interface Shape {

    String getFillColor();

    String getBorderColor();

    double getArea();

    double getPerimeter();

    default void printCharacteristics(){
        System.out.println("Цвет заливки " + getFillColor());
        System.out.println("Цвет границы " + getBorderColor());
        System.out.println("Площадь " + getArea());
        System.out.println("Периметр " + getPerimeter());
        System.out.println();
    }
}
