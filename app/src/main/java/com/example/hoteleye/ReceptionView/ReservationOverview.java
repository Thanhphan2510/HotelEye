package com.example.hoteleye.ReceptionView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.hoteleye.Adapter.ReservationOverviewAdapter;
import com.example.hoteleye.Adapter.StaffManagerSettingsAdapter;
import com.example.hoteleye.ManagerView.ManagerHome;
import com.example.hoteleye.ManagerView.StaffManagerSettings;
import com.example.hoteleye.R;
import com.example.hoteleye.ViewModel.ReservationOverviewItem;
import com.example.hoteleye.ViewModel.StaffManagerItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ReservationOverview extends AppCompatActivity {
    private ListView listView;
    private Button next_button;
    private FloatingActionButton add_fab;
    ArrayList<ReservationOverviewItem> reservationOverviewItems;
    ReservationOverviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_overview);
        init();

    }
    private void init() {
        listView = findViewById(R.id.reservation_overview_listview);
        add_fab = findViewById(R.id.add_reservation_overview_fab);
//        next_button = findViewById(R.id.next_btn_staffmanager_setting);

        reservationOverviewItems = new ArrayList<>();
        reservationOverviewItems.add(new ReservationOverviewItem(1,"01/10/2020",
                "02/10/2020","08/10/2020",101,"Thanh Phan"
                ,2,200000,"Không"));
        reservationOverviewItems.add(new ReservationOverviewItem(1,"01/10/2020",
                "02/10/2020","08/10/2020",101,"Thanh Phan"
                ,2,200000,"Không"));
        reservationOverviewItems.add(new ReservationOverviewItem(1,"01/10/2020",
                "02/10/2020","08/10/2020",101,"Thanh Phan"
                ,2,200000,"Không"));
        reservationOverviewItems.add(new ReservationOverviewItem(1,"01/10/2020",
                "02/10/2020","08/10/2020",101,"Thanh Phan"
                ,2,200000,"Không"));
        adapter = new ReservationOverviewAdapter(getApplicationContext(), reservationOverviewItems);
        listView.setAdapter(adapter);

        add_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }
    private void switchView() {
        Intent intent = new Intent(ReservationOverview.this, ReservationCustomer.class)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
//        finish();
    }
}
