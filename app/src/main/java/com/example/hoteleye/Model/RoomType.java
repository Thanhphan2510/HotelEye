package com.example.hoteleye.Model;

import java.util.List;

public class RoomType {
    private int roomtype_id;
    private String type_name;
    private int capacity;
    private List<FixedFurniture> fixedFurnitures;
    private String description;

    public RoomType(int roomtype_id, String type_name, int capacity, List<FixedFurniture> fixedFurnitures, String description) {
        this.roomtype_id = roomtype_id;
        this.type_name = type_name;
        this.capacity = capacity;
        this.fixedFurnitures = fixedFurnitures;
        this.description = description;
    }
}
