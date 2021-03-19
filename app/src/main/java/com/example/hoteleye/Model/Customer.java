package com.example.hoteleye.Model;

public class Customer {
    private int id_card;
    private String customer_name;
    private String dateOfBirth;
    private String company_name;
    private String phone_number;
    private String mail;
    private float discount;
    private String note;

    public Customer(int id_card, String customer_name, String dateOfBirth, String company_name, String phone_number, String mail, float discount, String note) {
        this.id_card = id_card;
        this.customer_name = customer_name;
        this.dateOfBirth = dateOfBirth;
        this.company_name = company_name;
        this.phone_number = phone_number;
        this.mail = mail;
        this.discount = discount;
        this.note = note;
    }
}
