package com.company.soaldua;

import java.util.Scanner;

public class Main2 {
    /*
    * Naming Convention
    *+ camelCase -> huruf awalnya kecil. Huruf pertama di kata selanjutnya kapital -> variable & method
    *+ PascalCase -> camelCase dengan huruf pertamanya kapital -> Class
    *  kebab-case -> Huruf kecil semua, setiap kata dipisahkan pakai - ->PHP / CS
    *  snake_case -> Huruf kecil semua, setiap kata dipisahkan pakai _ -> Penamaan Resource image_profile.jpg
    *+ UPPER_SNAKE_CASE -> snake_case dengan semua huruf kapital -> penamaan variable konstanta
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        Double gpa;
        int choice;

        System.out.println("Hello, Welcome to Student DUmmy Data !");

        do{
            System.out.print("Input your name [3 - 15 characters] (cannot be change) : ");
            name = sc.nextLine();
        }while (!StudentSekolahNegeri.isNameValid(name));

        do {
            System.out.print("Input your age [min 16](Cannot be change) : ");
            age = sc.nextInt();
        }while (age <16);

        do {
            System.out.print("Input your gpa [0.0 - 4.0 inclusive] : ");
            gpa = sc.nextDouble();
        } while (gpa < 0.0 || gpa > 4.0);

        StudentSekolahNegeri student;
        student = new StudentSekolahNegeri(name, age, gpa);

        do{
            System.out.println("Welcome, "+ student.getName());
            System.out.println("Student DUmmy Data");
            System.out.println("==================");
            System.out.println("1. View Data");
            System.out.println("2. Update Data");
            System.out.println("3. Exit");
            System.out.print(">> ");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    student.viewData();
                    break;
                case 2:
                    student.viewData();

                    Double newGpa;
                    do{
                        System.out.print("Input your gpa [0.0 - 4.0 inclusive] : ");
                        newGpa = sc.nextDouble();
                    }while (newGpa < 0.0 || newGpa > 4.0);
                    student.setGpa(newGpa);
                    System.out.println("Student data updated Successfully");
                    break;
            }
        }while(choice != 3);

    }
}