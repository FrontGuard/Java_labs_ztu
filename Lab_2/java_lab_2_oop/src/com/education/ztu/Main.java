package com.education.ztu;

public class Main {

    public static void main(String[] args) {
        // Створення об'єктів
        Student student = new Student("Ivan", "Petrov", 20, Gender.MALE, Location.KIEV, "Software Engineering", "ZTU");
        Teacher teacher = new Teacher("Maria", "Ivanova", 35, Gender.FEMALE, Location.ZHYTOMYR, "Math", "ZTU", new Car("Toyota"));
        Employee employee = new Employee("Oleg", "Sidorov", 40, Gender.MALE, Location.VINNYTSYA, "ABC Corp", "Manager", new Car("BMW"));

        // Виведення інформації
        student.sayFullName();
        teacher.sayFullName();
        employee.sayFullName();

        // Використання оператора instanceof
        if (teacher instanceof Person) {
            System.out.println("Teacher is a person.");
        }

        // Використання методу showCounter
        Person.showCounter();
    }
}
