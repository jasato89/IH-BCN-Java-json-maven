package classes;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String showInfo() {
        if (age < 100) {

            return name.trim() + " " + surname.trim() + " is " + age + " old";
        } else {
            return "Problem with this object, age can't be higher than 100";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            System.err.println("Age can't be higher than 100. Initialized with 0");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
