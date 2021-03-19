package com.example.hoteleye.ReceptionView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hoteleye.Adapter.ManagerHomeAdapter;
import com.example.hoteleye.Adapter.ReservationRoomAdapter;
import com.example.hoteleye.R;
import com.example.hoteleye.ViewModel.RoomNameItem;

import java.util.ArrayList;
import java.util.List;

public class ReservationRoom extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button next_btn;
    List<RoomNameItem> roomNameItems;
    ReservationRoomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_room);
        init();
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }
    private void init() {
        recyclerView = findViewById(R.id.rerservation_room_receyclerview);
        next_btn = findViewById(R.id.next_btn_reservation_room);
        roomNameItems = new ArrayList<>();

        //thêm danh sách phòng
//        for(int i =101; i <107;i++){
//            roomNameItems.add(new RoomNameItem(""+i));
//
//        }
        roomNameItems.add(new RoomNameItem("101",0));
        roomNameItems.add(new RoomNameItem("102",0));
        roomNameItems.add(new RoomNameItem("103",0));
        roomNameItems.add(new RoomNameItem("104",4));
        roomNameItems.add(new RoomNameItem("105",4));
        roomNameItems.add(new RoomNameItem("106",0));
        roomNameItems.add(new RoomNameItem("107",4));
        roomNameItems.add(new RoomNameItem("201",0));
        roomNameItems.add(new RoomNameItem("202",4));
        roomNameItems.add(new RoomNameItem("203",0));
        roomNameItems.add(new RoomNameItem("204",0));
        roomNameItems.add(new RoomNameItem("205",4));
        roomNameItems.add(new RoomNameItem("206",0));
        roomNameItems.add(new RoomNameItem("207",4));


        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),4));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new ReservationRoomAdapter(getApplicationContext(), roomNameItems);
        recyclerView.setAdapter(adapter);

    }
    private void switchView() {
        Intent intent = new Intent(ReservationRoom.this, ReservationFinal.class);
//                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
}
