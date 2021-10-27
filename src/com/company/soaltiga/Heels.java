package com.company.soaltiga;

public class Heels extends FootWear {
    private double height;

    public Heels(double height, String name, int price, String type) {
        this.height = height;
        super.name = name;
        super.price = price;
        super.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
