package com.company.soaltiga;

public class RollerSkate extends FootWear {
    private int totalWheel;

    public RollerSkate(int totalWheel, String name, int price, String type) {
        this.totalWheel = totalWheel;
        super.name = name;
        super.price = price;
        super.type = type;
    }

    public int getTotalWheel() {
        return totalWheel;
    }

    public void setTotalWheel(int totalWheel) {
        this.totalWheel = totalWheel;
    }
}
