package com.company.soaldua;

import java.util.ArrayList;

public class Student {

    private final String name;
    private int age;
    private double gpa;

    //  Ciri2 Constructor
    //  1. Nama Methodnya SAMA PERSIS seperti nama Class

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static boolean isNameValid(String name){
        return name.length() >= 3 && name.length() <= 15;
    }

    public void someMethod(){

    }
}
