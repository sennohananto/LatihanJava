package com.company.soaltiga;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<FootWear> arrayList = new ArrayList<>();

    private static boolean showData() {
        if (arrayList.isEmpty()) {
            System.out.println("There are no footwear to display!");
            return false;
        } else {
            System.out.println("=================================================");
            System.out.println("| No | Name \t\t\t | Price\t | Height  | Total Wheels |");
            System.out.println("=================================================");

            for (int i = 1; i <= arrayList.size(); i++) {
                if (arrayList.get(i - 1).type.equals("Heels")) {
                    Heels heels = (Heels) arrayList.get(i - 1);
                    System.out.println("|  " + i + " | " + heels.name + " \t | " + heels.price + " | " + heels.getHeight() + " | - \t |");
                } else {
                    RollerSkate rollerSkate = (RollerSkate) arrayList.get(i - 1);
                    System.out.println("|  " + i + " | " + rollerSkate.name + " \t | " + rollerSkate.price + " |  - \t" + "| " + rollerSkate.getTotalWheel() + " wheels |");
                }
            }
            System.out.println("=================================================");
            return true;
        }
    }

    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println("Just DU It !!");
            System.out.println("=============");
            System.out.println("1. Add Footwear");
            System.out.println("2. View Footwear");
            System.out.println("3. Update Footwear");
            System.out.println("4. Delete Footwear");
            System.out.println("5. Exit");
            System.out.print(">> ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String name = "", type = "";
                    int price = 0;
                    double height = 0;
                    int totalWheel = 0;

                    do {
                        System.out.print("Footwear Name: ");
                        name = sc.nextLine();
                    } while (name.length() < 3 || name.length() > 25);

                    do {
                        System.out.print("Footwear Price [more than 10000]: ");
                        price = sc.nextInt();
                    } while (price < 10000);

                    do {
                        System.out.println("Footwear Type [Heels / RollerSkate]: ");
                        type = sc.nextLine();
                    } while (!(type.equals("Heels") || type.equals("RollerSkate")));


                    if (type.equals("Heels")) {
                        do {
                            System.out.println("Footwear height [1.0 - 9.0]: ");
                            height = sc.nextDouble();
                        } while (height < 1.0 || height > 9.0);

                        Heels heels = new Heels(height, name, price, type);
                        arrayList.add(heels);
                    } else {
                        do {
                            System.out.println("Footwear total wheel [2 - 4 inclusive]: ");
                            totalWheel = sc.nextInt();
                        } while (totalWheel < 2 || totalWheel > 4);
                        RollerSkate rollerSkate = new RollerSkate(totalWheel, name, price, type);

                        arrayList.add(rollerSkate);
                    }

                    System.out.println("Foot wear added successfully !!");
                    break;

                case 2:
                    showData();
                    break;
                case 3:
                    if (showData()) {
                        int index;
                        do {
                            System.out.print("Input footwear index to update : ");
                            index = sc.nextInt();
                        } while (index < 1 || index > arrayList.size());

                        String newName = "";
                        int newPrice = 0;
                        double newHeight = 0;
                        int newTotalWheel = 0;

                        do {
                            System.out.print("Footwear Name: ");
                            newName = sc.nextLine();
                        } while (newName.length() < 3 || newName.length() > 25);

                        do {
                            System.out.print("Footwear Price [more than 10000]: ");
                            newPrice = sc.nextInt();
                        } while (newPrice < 10000);

                        if (arrayList.get(index - 1).type.equals("Heels")) {
                            do {
                                System.out.println("Footwear height [1.0 - 9.0]: ");
                                newHeight = sc.nextDouble();
                            } while (newHeight < 1.0 || newHeight > 9.0);

                            Heels newHeels = new Heels(newHeight, newName, newPrice, arrayList.get(index - 1).type);
                            arrayList.set(index - 1, newHeels);
                        } else {
                            do {
                                System.out.println("Footwear total wheel [2 - 4 inclusive]: ");
                                newTotalWheel = sc.nextInt();
                            } while (newTotalWheel < 2 || newTotalWheel > 4);
                            RollerSkate newRollerSkate = new RollerSkate(newTotalWheel, newName, newPrice, arrayList.get(index - 1).type);
                            arrayList.set(index - 1, newRollerSkate);
                        }
                    }

                    break;
                case 4:
                    if (showData()) {
                        int index;
                        do {
                            System.out.print("Input footwear index to delete : ");
                            index = sc.nextInt();
                        } while (index < 1 || index > arrayList.size());

                        arrayList.remove(index - 1);
                        System.out.println("Footwear deleted successfully");
                    }
                    break;
            }
        } while (choice != 5);


    }
}
