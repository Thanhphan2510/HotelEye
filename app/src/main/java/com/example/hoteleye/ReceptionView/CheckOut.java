package com.example.hoteleye.ReceptionView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.hoteleye.Adapter.CheckoutAdapter;
import com.example.hoteleye.Adapter.ReservationOverviewAdapter;
import com.example.hoteleye.R;
import com.example.hoteleye.ViewModel.ChooseServiceItem;
import com.example.hoteleye.ViewModel.ReservationOverviewItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CheckOut extends AppCompatActivity {
    private ListView listView;
    private FloatingActionButton add_fab;
    private Button checkout_btn;
    ArrayList<ChooseServiceItem> chooseServiceItems;
    CheckoutAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        init();
    }
    private void init() {
        listView = findViewById(R.id.checkout_listview);
//        add_fab = findViewById(R.id.add_reservation_overview_fab);
        checkout_btn = findViewById(R.id.checkout_btn);

        chooseServiceItems= new ArrayList<>();
        chooseServiceItems.add(new ChooseServiceItem("Bia Hà Nội",0));
        chooseServiceItems.add(new ChooseServiceItem("Bia Hà Nội",0));
        chooseServiceItems.add(new ChooseServiceItem("Bia Hà Nội",1));

        adapter = new CheckoutAdapter(getApplicationContext(), chooseServiceItems);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        checkout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }
    private void switchView() {
        Intent intent = new Intent(CheckOut.this, Invoice.class)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
//        finish();
    }
}
