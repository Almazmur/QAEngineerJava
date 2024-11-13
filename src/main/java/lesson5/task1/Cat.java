package lesson5.task1;

class Cat extends Animal {
    private boolean isFull = false; // Сытость
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0); // Кот не умеет плавать
        catCount++;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= 10) { // Условие: коту нужно минимум 10 еды
            bowl.decreaseFood(10);
            isFull = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не смог покушать, недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
