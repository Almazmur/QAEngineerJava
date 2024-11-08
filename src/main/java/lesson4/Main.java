package lesson4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван", "Иванов", "Петрович", 23, "Engineer", "ivan@mail.ru", "+7999888777", 30000);
        employees[1] = new Employee("Василий", "Смирнов", "Сергеевич", 31, "Manager", "smirnov@mail.ru", "+79993564777", 50000);
        employees[2] = new Employee("Вова", "Кузнецов", "Николаевич", 35, "Developer", "vova@mail.ru", "+799982345677", 100000);
        employees[3] = new Employee("Ольга", "Яковлева", "Александрова", 49, "Director", "olga@mail.ru", "+7999636489", 150000);
        employees[4] = new Employee("Анастасия", "Шилова", "Андреевна", 36, "Analyst", "chilova@mail.ru", "+7999463253", 40000);

        for (Employee employee : employees) {
            employee.printInfo();
       }

        System.out.println("---------");

        Park park = new Park();
        Park.Attraction ferrisWheel = park.createAttraction("Ferris Wheel", "9.00 - 22.00", 150.00);
        Park.Attraction rollerCoaster = park.createAttraction("Roller Coaster", "10.00 - 21.00", 120.00);
        System.out.println(ferrisWheel);
        System.out.println(rollerCoaster);

    }
}
