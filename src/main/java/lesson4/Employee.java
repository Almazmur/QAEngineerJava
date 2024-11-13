package lesson4;

public class Employee {
    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;
    private String position;
    private String email;
    private String telephone;
    private int salary;

    public Employee(String firstName,
                    String lastName,
                    String patronymic,
                    int age,
                    String position,
                    String email,
                    String telephone,
                    int salary) {
        this.firstName = firstName;
        this.salary = salary;
        this.telephone = telephone;
        this.email = email;
        this.position = position;
        this.age = age;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "lesson4.Employee{" +
                "name='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", post='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", salary=" + salary +
                '}';
    }
}
