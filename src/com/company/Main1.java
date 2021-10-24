package com.company;

import java.util.Scanner;

public class Main1 {
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

        switch (userChoice) {
            case 1:
                int fullRectangleSize;
                do {
                    System.out.print("Input Full Rectangle Size [greater than 1] : ");
                    fullRectangleSize = sc.nextInt();

                } while (fullRectangleSize <= 1);

                System.out.println("Here is the full rectangle");

                //baris
//                   initialize   ; kondisi for akan terus berjalan ; aksi yang dilakukan setiap iterasi dilakukan
                //ITERASI
                //1 : baris=0 ; TRUE ;
                //

                /*
                   0 1 2
                 0 * * *
                 1
                 2


                 */

                //BARIS
                for (int baris = 0; baris < fullRectangleSize; baris++) {
                    //KOLOM
                    for (int kolom = 0; kolom < fullRectangleSize; kolom++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            case 2:
                int emptyRectangleSize;
                do {
                    System.out.print("Input Empty Rectangle Size [greater than 2]");
                    emptyRectangleSize = sc.nextInt();
                } while (emptyRectangleSize <= 2);

                System.out.println("Here is the empty rectangle");


                /*

                  0 1 2 3
                0 *
                1
                2
                3


                i++ Post Increment
                i-- Post Decrement
                --i Pre Decrement
                ++i Pre Increment


                * */



                //input size 4
                //iterasi 0 1 2 3

                //1 2 3 4
                //0 1 2 3

                //input size 90
                //0 1 ... 89

                //baris
                for (int baris = 1; baris <= emptyRectangleSize; baris++) {
                    //kolom
                    for (int kolom = 1; kolom <= emptyRectangleSize; kolom++) {
                        //Baris pertama dan terakhir

                        // (baris pertama)
                        if (baris == 1 || baris == emptyRectangleSize) {
                            System.out.print("*");
                            //Baris tengah2 untuk cetak bintang
                        } else if (kolom == 1 || kolom == emptyRectangleSize) {
                            System.out.print("*");
                            //Baris tengah2 untuk cetak spasi
                        } else {
                            System.out.print(" ");
                        }
                    }
                    //Untuk mindahin baris
                    System.out.println("");
                }
                break;

                /*

                  1 2 3 4
                 1
                 2
                 3
                 4

                 */
            case 3:
                int rightTriangleHeight;
                do {
                    System.out.print("Input Right Triangle Height [greater than 3]");
                    rightTriangleHeight = sc.nextInt();
                } while (rightTriangleHeight <= 3);

                System.out.println("Here is the Right Triangle Shape");

                //baris
                for (int baris = 1; baris <= rightTriangleHeight; baris++) {
                    //kolom
                    for (int kolom = 1; kolom <= baris; kolom++) {

                        //cetak bintang ful di baris pertama dan terakhir
                        if (baris == 1 || baris == rightTriangleHeight) {
                            System.out.print("*");
                            //cetak bintang di baris tengah
                        } else if (kolom == 1 || kolom == baris) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:

            default:
        }
    }
}
