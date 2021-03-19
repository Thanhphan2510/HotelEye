package com.example.hoteleye.ManagerView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.hoteleye.Model.Account;
import com.example.hoteleye.R;
import com.example.hoteleye.StaffView.StaffHome;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private EditText username_edt, pass_edt;
    private Button login_btn;
    Account account_db;
    ArrayList<Account> accounts;
    String url = "http://192.168.100.10/androidwebservice/getdata.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
//        readJSON(url);
        account_db = new Account("admin", "admin123",1);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getData(url);
//                Toast.makeText(LoginActivity.this, accounts.toString(), Toast.LENGTH_SHORT).show();
//                switchView();
                checkrole(1);

            }
        });


    }

    private void checkrole(int role){
        if(role == 1){
            switchView_ManagerHome();
        }
        else if(role == 2){
            switchView_StaffHome();
        }
    }
    private void switchView_ManagerHome() {
        Intent intent = new Intent(LoginActivity.this, ManagerHome.class);
//        Intent intent = new Intent(LoginActivity.this, HotelBasicInforSettings.class);
//                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
    private void switchView_StaffHome() {
        Intent intent = new Intent(LoginActivity.this, StaffHome.class);
//        Intent intent = new Intent(LoginActivity.this, HotelBasicInforSettings.class);
//                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }


    private void init() {
        username_edt = findViewById(R.id.username_login);
        pass_edt = findViewById(R.id.password_login);
        login_btn = findViewById(R.id.login_btn);
        accounts = new ArrayList<>();
    }
    private void readJSON(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Toast.makeText(LoginActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LoginActivity.this,  error.toString(), Toast.LENGTH_SHORT).show();
                Log.e("thanhphan", error.toString());
            }
        }
        );
        requestQueue.add(jsonArrayRequest);

    }
    public void getData(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for(int i = 0; i < response.length(); i++){
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        Log.e("thanhphan", "onResponsea: "+jsonObject.toString() );

                        accounts.add(new Account(jsonObject.getString("username"),
                                jsonObject.getString("password"), jsonObject.getInt("role")));

                        for(Account a :accounts){
                            if(a.getUsername().equals(username_edt.getText().toString())&&
                                    a.getPassword().equals(pass_edt.getText().toString())){
//                                switchView();
                            }
                            else
                                Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_LONG);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(jsonArrayRequest);
    }
    
}
