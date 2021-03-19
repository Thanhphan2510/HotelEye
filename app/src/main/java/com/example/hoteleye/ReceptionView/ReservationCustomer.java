package com.example.hoteleye.ReceptionView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hoteleye.ManagerView.HotelBasicInforSettings;
import com.example.hoteleye.ManagerView.RoomsOverviewSettings;
import com.example.hoteleye.R;

public class ReservationCustomer extends AppCompatActivity {
    Button next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_customer);
        initView();
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }
    private void initView() {
        next_btn = findViewById(R.id.next_btn_reservation_customer);
    }
    private void switchView() {
        Intent intent = new Intent(ReservationCustomer.this, ReservationRoom.class);
//                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
}
