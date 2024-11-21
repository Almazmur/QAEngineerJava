package lesson5.task1;

public class Bowl {

    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0); // Еда не может быть отрицательной
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды.");
        }
    }

    @Override
    public String toString() {
        return "Миска содержит " + foodAmount + " единиц еды.";
    }
}

