package com.example.hoteleye.ReceptionView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hoteleye.ManagerView.ManagerHome;
import com.example.hoteleye.R;

public class ReservationFinal extends AppCompatActivity {
    Button next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_final);
        initView();
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }
    private void initView() {
        next_btn = findViewById(R.id.next_btn_reservation_final);
    }
    private void switchView() {
        Intent intent = new Intent(ReservationFinal.this, ManagerHome.class);
//                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
}
