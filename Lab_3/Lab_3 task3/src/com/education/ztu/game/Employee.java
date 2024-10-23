package com.education.ztu.game;

public class Employee extends Participant {

    public Employee(String name, int age) {
        super(name, age);
    }

    // Метод clone публічний
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
