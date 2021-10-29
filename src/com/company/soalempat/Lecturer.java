package com.company.soalempat;

public class Lecturer extends Human{
    private int salary;

    public Lecturer(int salary, String name, String role, int age){
        this.salary = salary;
        super.name = name;
        super.role = role;
        super.age = age;
    }

    @Override
    void menyebutkanDataProfesi() {
        memperkenalkanDiri();
        System.out.println("My Salary is "+ salary);
    }
}
