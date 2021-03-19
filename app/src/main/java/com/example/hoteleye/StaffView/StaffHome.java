package com.example.hoteleye.StaffView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hoteleye.ManagerView.ManagerHome;
import com.example.hoteleye.ManagerView.StaffManagerSettings;
import com.example.hoteleye.R;

public class StaffHome extends AppCompatActivity {

    private Button incomeByTime_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_home);
        init();
        incomeByTime_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }

    private void init() {
        incomeByTime_btn = findViewById(R.id.incomebytime_btn);
    }
    private void switchView() {
        Intent intent = new Intent(StaffHome.this, ManagerHome.class)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
//        finish();
    }
}
