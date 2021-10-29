package com.company.soalempat;

abstract class Human {
    protected String name, role;
    protected int age;

    final protected void memperkenalkanDiri(){
        System.out.println("Hello, my name is "+name);
        System.out.println("I am "+age+" year(s) old");
        System.out.println("I am a "+role);
    }

    abstract void menyebutkanDataProfesi();
}
