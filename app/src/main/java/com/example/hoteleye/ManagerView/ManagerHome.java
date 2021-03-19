package com.example.hoteleye.ManagerView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoteleye.Adapter.ManagerHomeAdapter;
import com.example.hoteleye.R;
import com.example.hoteleye.ReceptionView.ReservationCustomer;
import com.example.hoteleye.ReceptionView.ReservationOverview;
import com.example.hoteleye.ViewModel.RoomNameItem;

import java.util.ArrayList;
import java.util.List;

public class ManagerHome extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView viewreport_tv;
    List<RoomNameItem> roomNameItems;
    ManagerHomeAdapter adapter;

    androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_home);
        toolbar = findViewById(R.id.toolbar_manager);
//        toolbar.setSubtitle("Test Subtitle");
        toolbar.inflateMenu(R.menu.menu_manager);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.reservation_item_menu:
                        reservation();
                        return true;
                }
                return false;
            }
        });

        init();
        viewreport_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewReport();
            }
        });
    }

    private void viewReport() {
        Intent intent = new Intent(ManagerHome.this, ViewReportOverview.class)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    private void init() {
        recyclerView = findViewById(R.id.managerhome_receyclerview);
        viewreport_tv = findViewById(R.id.viewrepot_tv_home);
        roomNameItems = new ArrayList<>();

        //thêm danh sách phòng
//        for(int i =101; i <107;i++){
//            roomNameItems.add(new RoomNameItem(""+i));
//
//        }
        roomNameItems.add(new RoomNameItem("101",1));
        roomNameItems.add(new RoomNameItem("102",1));
        roomNameItems.add(new RoomNameItem("103",1));
        roomNameItems.add(new RoomNameItem("104",1));
        roomNameItems.add(new RoomNameItem("105",1));
        roomNameItems.add(new RoomNameItem("106",1));
        roomNameItems.add(new RoomNameItem("107",1));
        roomNameItems.add(new RoomNameItem("201",1));
        roomNameItems.add(new RoomNameItem("202",2));
        roomNameItems.add(new RoomNameItem("203",3));
        roomNameItems.add(new RoomNameItem("204",3));
        roomNameItems.add(new RoomNameItem("205",2));
        roomNameItems.add(new RoomNameItem("206",1));
        roomNameItems.add(new RoomNameItem("207",4));


        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),4));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new ManagerHomeAdapter(getApplicationContext(), roomNameItems);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.menu_manager, menu);

        return super.onCreateOptionsMenu(menu);
    }


    private void reservation() {
        Intent intent = new Intent(ManagerHome.this, ReservationOverview.class)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

}
