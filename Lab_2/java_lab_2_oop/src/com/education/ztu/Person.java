package com.education.ztu;

public abstract class Person implements Human {
    private int age;
    private String firstname;
    private String lastname;
    protected Gender gender;
    protected Location location;
    protected static int counter = 0;

    // Ініціалізаційний блок для конструктора без аргументів
    {
        firstname = "Unknown";
        lastname = "Unknown";
        age = 0;
        gender = Gender.MALE;
        location = Location.KIEV;
    }

    // Конструктор без аргументів
    public Person() {
        counter++;
    }

    // Конструктор з аргументами
    public Person(String firstname, String lastname, int age, Gender gender, Location location) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.location = location;
        counter++;
    }

    // Абстрактний метод
    public abstract String getOccupation();

    // Геттери та сеттери
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void showCounter() {
        System.out.println("Number of people: " + counter);
    }

    public String getFullInfo() {
        return firstname + " " + lastname + ", age: " + age + ", gender: " + gender + ", location: " + location;
    }

    @Override
    public void sayFullName() {
        System.out.println(firstname + " " + lastname);
    }

    @Override
    public void sayAge() {
        System.out.println("Age: " + age);
    }

    @Override
    public void sayLocation() {
        System.out.println("Location: " + location);
    }

    @Override
    public void sayGender() {
        System.out.println("Gender: " + gender);
    }
}
