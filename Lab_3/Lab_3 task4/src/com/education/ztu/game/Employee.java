package com.education.ztu.game;

public class Employee extends Participant {
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
