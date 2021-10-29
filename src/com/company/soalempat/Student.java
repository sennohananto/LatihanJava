package com.company.soalempat;

public class Student extends Human implements MakhlukHidup{
    private double gpa;

    public Student(double gpa, String name, String role, int age) {
        this.gpa = gpa;
        super.name = name;
        super.role = role;
        super.age = age;
    }

    @Override
    void menyebutkanDataProfesi() {
        super.memperkenalkanDiri();
        System.out.println("My gpa is "+gpa);

    }

    public void memakan(){
        System.out.println("Saya sedang makan");
    }

    public void memakan(String makanan){
        System.out.println("Saya sedang memakan "+makanan);
    }

    @Override
    public void bernafas() {
        System.out.println("Bernafas menggunakan paru2");
    }
}
