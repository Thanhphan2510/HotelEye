package com.example.hoteleye.ViewModel;

public class RoomNameItem {

    private String name;
    private int room_status;

    public RoomNameItem(String name, int room_status) {
        this.name = name;
        this.room_status = room_status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom_status() {
        return room_status;
    }

    public void setRoom_status(int room_status) {
        this.room_status = room_status;
    }
}
