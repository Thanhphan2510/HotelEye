package com.example.hoteleye.Model;

public class SurCharge {
    private int surcharge_id;
    private Service service;
    private float unit_price;
    private int quantity;
    private float discount;
    private float total_price;
    private String note;

    public SurCharge(int surcharge_id, Service service, float unit_price, int quantity, float discount, float total_price, String note) {
        this.surcharge_id = surcharge_id;
        this.service = service;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.discount = discount;
        this.total_price = total_price;
        this.note = note;
    }
}
