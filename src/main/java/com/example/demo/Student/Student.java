package com.example.demo.Student;

import java.time.LocalDate;
import java.time.LocalTime;

public class Student {

    private int ID;
    private int age;
    private String name;
    private LocalDate DOB;

    public Student() {
    }

    public Student(int ID, int age, String name, LocalDate DOB) {
        this.ID = ID;
        this.age = age;
        this.name = name;
        this.DOB = DOB;
    }

    public Student(int age, String name, LocalDate DOB) {
        this.age = age;
        this.name = name;
        this.DOB = DOB;
    }



    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
}
