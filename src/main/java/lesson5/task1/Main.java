package lesson5.task1;

public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        // Тестирование методов бегать и плавать
        dogBobik.run(150);
        dogBobik.swim(8);

        catMurzik.run(150);
        catMurzik.swim(5);

        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        // Создание миски с едой и котов
        Bowl bowl = new Bowl(25);
        Cat[] cats = {catMurzik, catBarsik};

        // Коты пытаются покушать
        System.out.println("\n" + bowl);
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println("\n" + bowl);

        // Проверка сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        // Добавляем еду в миску
        bowl.addFood(15);
        System.out.println("\n" + bowl);
    }
}