package com.education.ztu;

public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    // Конструктори
    public Employee() {
    }

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = 0.0; // За замовчуванням
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", position='" + position + "', salary=" + salary + "}";
    }
}
