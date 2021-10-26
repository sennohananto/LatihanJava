package com.company.soaldua;

//Class Header
public class Student {
    private final String name;
    private final int age;
    private double gpa;

    //Constructor = Method yang namanya SAMA PERSIS seperti nama class nya
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static boolean isNameValid(String name){
        return name.length() >= 3 && name.length() <= 15;
    }

    public void viewData(){
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your gpa is "+gpa +" / 4.0");

    }

}
