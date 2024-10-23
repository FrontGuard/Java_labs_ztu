package com.education.ztu;

public class Student extends Person {
    private String speciality;
    private String university;

    public Student(String firstname, String lastname, int age, Gender gender, Location location, String speciality, String university) {
        super(firstname, lastname, age, gender, location);
        this.speciality = speciality;
        this.university = university;
    }

    public Student() {
        super();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String getOccupation() {
        return "Student";
    }
}
