package com.example.hoteleye.Model;

class Room {
    private int room_number;
    private RoomType roomType;
    private int floor_number;
    private float open_price;
    private float hour_price;
    private float night_price;
    private  String description; //vd: đối diện mặt đường,...
    private int status; // -3: phòng không còn sử dụng, -2: phòng có khách, -1: phòng có người đặt, 0: phòng chưa dọn, 1: phòng đã dọn (phòng trống)
    private String note; //vd: có vấn đề như thiếu chăn lúc khách ra

    public Room(int room_number, RoomType roomType, int floor_number, float open_price, float hour_price, float night_price, String description, int status, String note) {
        this.room_number = room_number;
        this.roomType = roomType;
        this.floor_number = floor_number;
        this.open_price = open_price;
        this.hour_price = hour_price;
        this.night_price = night_price;
        this.description = description;
        this.status = status;
        this.note = note;
    }
}
