package com.oyinloyeayodeji.www.mycarshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MaintenanceActivity extends AppCompatActivity {

    ArrayList<CarShop> services;

    Button addService, pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);

        addService = (Button)findViewById(R.id.add_service);
        pay = (Button)findViewById(R.id.pay);

        addService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MaintenanceActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


        Bundle extras = getIntent().getExtras();
        if(extras != null){
            services = (ArrayList<CarShop>)extras.getSerializable("list");
        }

        ListView carShopList = (ListView)findViewById(R.id.service_list);

        CarShopAdapter adapter = new CarShopAdapter(this, services);

        carShopList.setAdapter(adapter);
    }
}
