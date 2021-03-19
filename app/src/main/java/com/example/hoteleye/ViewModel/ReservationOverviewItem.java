package com.example.hoteleye.ViewModel;

public class ReservationOverviewItem {
    private int reservation_id;
    private String reservation_date,arrival_date, departure_date;
    private int customer_id;
    private String customer_name;
    private int quantity;
    private float deposit;
    private String note;

    public ReservationOverviewItem(int reservation_id, String reservation_date, String arrival_date,
                                   String departure_date, int customer_id, String customer_name, int quantity,
                                   float deposit, String note) {
        this.reservation_id = reservation_id;
        this.reservation_date = reservation_date;
        this.arrival_date = arrival_date;
        this.departure_date = departure_date;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.quantity = quantity;
        this.deposit = deposit;
        this.note = note;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public String getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
