package com.education.ztu.game;

public class Schoolar extends Participant {
    public Schoolar(String name, int age) {
        super(name, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
