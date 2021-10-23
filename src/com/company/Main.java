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
                int fullRectangleSize;
                do{
                    System.out.print("Input Full Rectangle Size [greater than 1] : ");
                    fullRectangleSize = sc.nextInt();

                }while (fullRectangleSize <= 1);

                System.out.println("Here is the full rectangle");

                //baris
                for (int i = 0; i < fullRectangleSize; i++) {

                    //kolom
                    for (int j = 0; j < fullRectangleSize; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                int emptyRectangleSize;
                do{
                    System.out.print("Input Empty Rectangle Size [greater than 2]");
                    emptyRectangleSize = sc.nextInt();
                }while (emptyRectangleSize <=2);

                System.out.println("Here is the empty rectangle");

                //baris
                for (int i = 0; i < emptyRectangleSize; i++) {

                    //kolom
                    for (int j = 0; j < emptyRectangleSize; j++) {
                        //Baris pertama dan terakhir
                        if(i == 0 || i == emptyRectangleSize-1){
                            System.out.print("*");
                        //Baris tengah2 untuk cetak bintang
                        }else if(j == 0 || j == emptyRectangleSize-1){
                            System.out.print("*");
                        //Baris tengah2 untuk cetak spasi
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }

                break;
            case 3:
                int rightTriangleHeight;
                do{
                    System.out.print("Input Right Triangle Height [greater than 3]");
                    rightTriangleHeight = sc.nextInt();
                }while (rightTriangleHeight <=3);

                System.out.println("Here is the Right Triangle Shape");

                //baris
                for (int i = 0; i < rightTriangleHeight; i++) {

                    //kolom
                    for (int j = 0; j <= i; j++) {
                        //cetak bintang ful di baris pertama dan terakhir
                        if(i == 0 || i == rightTriangleHeight-1){
                            System.out.print("*");

                        //cetak bintang di baris tengah
                        }else if(j==0 || j==i){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                return;
            default:

        }

    }
}
