package com.education.ztu.game;

public class Student extends Participant {

    public Student(String name, int age) {
        super(name, age);
    }

    // Метод clone публічний, щоб не було конфлікту
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
