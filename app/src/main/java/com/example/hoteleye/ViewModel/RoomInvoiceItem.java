package com.example.hoteleye.ViewModel;

public class RoomInvoiceItem {
    private int id;
    private String room_name;
    private int quantity;
    private String checkin_date, checkout_date;
    private float amout;

    public RoomInvoiceItem(int id, String room_name, int quantity, String checkin_date, String checkout_date, float amout) {
        this.id = id;
        this.room_name = room_name;
        this.quantity = quantity;
        this.checkin_date = checkin_date;
        this.checkout_date = checkout_date;
        this.amout = amout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(String checkin_date) {
        this.checkin_date = checkin_date;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }

    public float getAmout() {
        return amout;
    }

    public void setAmout(float amout) {
        this.amout = amout;
    }
}
