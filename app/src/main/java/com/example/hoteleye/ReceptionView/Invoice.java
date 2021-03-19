package com.example.hoteleye.ReceptionView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.hoteleye.Adapter.CheckoutAdapter;
import com.example.hoteleye.Adapter.RoomInvoiceAdapter;
import com.example.hoteleye.Adapter.ServiceInvoiceAdapter;
import com.example.hoteleye.ManagerView.ManagerHome;
import com.example.hoteleye.MyUtility.UIUtils;
import com.example.hoteleye.R;
import com.example.hoteleye.ViewModel.ChooseServiceItem;
import com.example.hoteleye.ViewModel.RoomInvoiceItem;
import com.example.hoteleye.ViewModel.ServiceInvoiceItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Invoice extends AppCompatActivity {
    private ListView listView_room, listView_service;
//    private FloatingActionButton add_fab;
    private Button checkout_btn;
    ArrayList<RoomInvoiceItem> roomInvoiceItems;
    ArrayList<ServiceInvoiceItem> serviceInvoiceItems;
    RoomInvoiceAdapter adapter_room;
    ServiceInvoiceAdapter adapter_service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        init();
    }
    private void init() {
        listView_room = findViewById(R.id.room_listview_invoice);
        listView_service = findViewById(R.id.service_listview_invoice);
//        add_fab = findViewById(R.id.add_reservation_overview_fab);
//        checkout_btn = findViewById(R.id.checkout_btn);

        roomInvoiceItems= new ArrayList<>();
        roomInvoiceItems.add(new RoomInvoiceItem(1,"101",2,"12h00 12/02/2020","14h 12/02/2020",200000));
        roomInvoiceItems.add(new RoomInvoiceItem(2,"101",2,"12h00 12/02/2020","14h 12/02/2020",200000));

        serviceInvoiceItems = new ArrayList<>();
        serviceInvoiceItems.add(new ServiceInvoiceItem(1,"Bia Hà Nội",2,10000, 20000));
        serviceInvoiceItems.add(new ServiceInvoiceItem(2,"Bia Hà Nội",2,10000, 20000));
        serviceInvoiceItems.add(new ServiceInvoiceItem(3,"Bia Hà Nội",2,10000, 20000));
        serviceInvoiceItems.add(new ServiceInvoiceItem(4,"Bia Hà Nội",2,10000, 20000));
        serviceInvoiceItems.add(new ServiceInvoiceItem(5,"Bia Hà Nội",2,10000, 20000));
        serviceInvoiceItems.add(new ServiceInvoiceItem(6,"Bia Hà Nội",2,10000, 20000));
        adapter_room = new RoomInvoiceAdapter(getApplicationContext(), roomInvoiceItems);
        adapter_service = new ServiceInvoiceAdapter(getApplicationContext(), serviceInvoiceItems);
        listView_room.setAdapter(adapter_room);
        listView_service.setAdapter(adapter_service);
        UIUtils.setListViewHeightBasedOnItems(listView_room);
        UIUtils.setListViewHeightBasedOnItems(listView_service);

    }
    private void switchView() {
        Intent intent = new Intent(Invoice.this, ManagerHome.class)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
//        finish();
    }
}
