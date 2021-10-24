package com.company.soaldua;

import java.util.ArrayList;

public class Main2 {
    public static ArrayList<Student> listStudent = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Student DUmmy Data !");
        System.out.print("Input your name [3 - 15 characters] (cannot be change)");

        //Variable () / Field / Entity / Object
        //Method / Function / Prochedure


        //NamaKelas namaVariable/object = new Constructor(parameter)

        //Instantiation ==> Proses pembuatan suatu object
        Student rafly = new Student("Rafly", 17, 3.9);
        Student senno = new Student("Senno", 17, 3.9);
        Student abdul = new Student("Andul", 17, 3.9);

    }
}
