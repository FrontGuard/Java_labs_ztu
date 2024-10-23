package com.education.ztu;

public class Employee extends Person {
    private String company;
    private String position;
    private Car car;

    public Employee(String firstname, String lastname, int age, Gender gender, Location location, String company, String position, Car car) {
        super(firstname, lastname, age, gender, location);
        this.company = company;
        this.position = position;
        this.car = car;
    }

    public Employee() {
        super();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }
}
