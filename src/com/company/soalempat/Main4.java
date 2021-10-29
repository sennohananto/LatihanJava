package com.company.soalempat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    private static ArrayList<Human> listOfHuman = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int choice = 0;
        do {
            System.out.println("1. Add People");
            System.out.println("2. View People");
            System.out.println("3. Remove People");
            System.out.println("4. Exit");
            System.out.print(">>");
            choice = sc.nextInt();

            String name = "", role;
            int age;
            switch (choice){
                case 1 :

                    do {
                        System.out.print("Input name [3-15 Character] : ");
                        name = sc.next();
                    }while (name.length() < 3 || name.length() > 15);

                    do {
                        System.out.print("Input age : ");
                        age = sc.nextInt();
                    }while (age < 16);

                    do {
                        System.out.print("Input role : ");
                        role = sc.next();
                    }while (!(role.equals("Student") || role.equals("Lecturer")));

                    double gpa;
                    int salary;
                    if(role.equals("Student")){
                        do {
                            System.out.print("Input gpa [0.0 - 4.0 inclusive] : ");
                            gpa = sc.nextDouble();
                        }while (gpa < 0.0 || gpa > 4.0);

                        Student student = new Student(gpa,name,role,age);
                        listOfHuman.add(student);
                        System.out.println("Student added successfully");
                    }else{
                        //Lecturer
                        do {
                            System.out.print("Input salary [min 4000000] : ");
                            salary = sc.nextInt();
                        }while (salary < 4000000);

                        Lecturer lecturer = new Lecturer(salary, name, role, age);
                        listOfHuman.add(lecturer);
                        System.out.println("Lecturer added successfully");
                    }

                    break;
                case 2:
                    if(listOfHuman.isEmpty()){
                        System.out.println("There are no peoples in classroom!");
                    }else{
                        for (int i = 1; i <= listOfHuman.size(); i++) {
                            System.out.print(i+". ");
                            listOfHuman.get(i-1).menyebutkanDataProfesi();
                            System.out.print("\n\n");
                        }
                    }

                    break;
                case 3:
                    if(listOfHuman.isEmpty()){
                        System.out.println("There are no peoples in classroom!");
                    }else{
                        int index;
                        do {
                            System.out.print("Input people index to delete : ");
                            index = sc.nextInt();
                        }while (index < 0 || index > listOfHuman.size());
                        listOfHuman.remove(index-1);
                    }

                    System.out.println("People deleted successfully !!");

                    break;
            }
        }while (choice!= 4);

    }
}
