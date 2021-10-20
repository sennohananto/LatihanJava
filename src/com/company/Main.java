package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        do{
            System.out.print("Welcome, please input your name [5-25 chars] : ");
            name = sc.nextLine();
        }while (name.length() < 5 || name.length() >25);

        System.out.println("Welcome, "+name);
        System.out.println("Shape Printer");
        System.out.println("=================");
        System.out.println("1. Full Rectangle Shape");
        System.out.println("2. Empty Rectangle Shape");
        System.out.println("3. Right Triange Shape");
        System.out.println("4. Exit");
        System.out.print("Choose >> ");
        int userChoice = sc.nextInt();

        switch (userChoice){
            case 1 :
                int rectangleSize;
                do{
                    System.out.print("Input Full Rectangle Size [greater than 1] : ");
                    rectangleSize = sc.nextInt();

                }while (rectangleSize <= 1);

                System.out.println("Here is the full rectangle");

                //baris
                for (int i = 0; i < rectangleSize; i++) {

                    //kolom
                    for (int j = 0; j < rectangleSize; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return;
            default:

        }

    }
}
