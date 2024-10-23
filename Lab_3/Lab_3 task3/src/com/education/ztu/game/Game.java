package com.education.ztu.game;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Student student1 = new Student("Mykola", 20);
        Student student2 = new Student("Viktoria", 21);
        Employee employee1 = new Employee("Andriy", 28);
        Employee employee2 = new Employee("Oksana", 25);

        // Створення команд для кожної ліги
        Team<Schoolar> scollarTeam = new Team<>("Dragon");
        scollarTeam.addNewParticipant(schoolar1);
        scollarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Robotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        // Гра між командами одного типу
        Team<Schoolar> scollarTeam2 = new Team<>("Rozumnyky");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);
        scollarTeam2.addNewParticipant(schoolar3);
        scollarTeam2.addNewParticipant(schoolar4);

        // Гра між двома командами школярів
        scollarTeam.playWith(scollarTeam2);  // OK: дві команди школярів

        // Додати гру між студентами
        Team<Student> studentTeam2 = new Team<>("StudentPower");
        Student student3 = new Student("Taras", 22);
        Student student4 = new Student("Nastya", 23);
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        studentTeam.playWith(studentTeam2);  // OK: дві команди студентів

        // Додати гру між працівниками
        Team<Employee> employeeTeam2 = new Team<>("Workaholics");
        Employee employee3 = new Employee("Dmytro", 30);
        Employee employee4 = new Employee("Yulia", 32);
        employeeTeam2.addNewParticipant(employee3);
        employeeTeam2.addNewParticipant(employee4);

        employeeTeam.playWith(employeeTeam2);  // OK: дві команди працівників
    }
}
