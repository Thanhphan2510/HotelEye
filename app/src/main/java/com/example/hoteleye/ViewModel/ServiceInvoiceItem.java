package com.example.hoteleye.ViewModel;

public class ServiceInvoiceItem {
    private int id;
    private String name;
    private int quantity;
    private float price;
    private float amout;

    public ServiceInvoiceItem(int id, String name, int quantity, float price, float amout) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amout = amout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmout() {
        return amout;
    }

    public void setAmout(float amout) {
        this.amout = amout;
    }
}
