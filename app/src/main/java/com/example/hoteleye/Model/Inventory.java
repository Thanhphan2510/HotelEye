package com.example.hoteleye.Model;

public class Inventory {
    private int inventory_id;
    private String inventory_name;
    private String import_date; //ngày nhập
    private int import_total;  // tổng số lượng nhập
    private String unity;      //đơn vị định lượng -> cái, hộp, thùng,...
    private float unit_importPrice; // giá nhập 1 unity
    private float unit_exportPrice; //giá xuất 1 unity. Đối với đồ mượn, đây là giá phải đền khi lm hư hại, ko còn sử dụng được nữa
    private int used_total;   //tổng số lượng đã dùng

//    private int total;       //tổng số lượng hiện tại

}
