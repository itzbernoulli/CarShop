package com.oyinloyeayodeji.www.mycarshop;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class   MainActivity extends AppCompatActivity {

    EditText service, code, cost,description;
    Button submit;

    final ArrayList<CarShop> services = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = (EditText)findViewById(R.id.service);
        code = (EditText)findViewById(R.id.code);
        cost = (EditText)findViewById(R.id.cost);
        description = (EditText)findViewById(R.id.description);

        submit = (Button)findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarShop car = new CarShop(
                        service.getText().toString(),
                        Integer.parseInt(code.getText().toString()),
                        Integer.parseInt(cost.getText().toString()),
                        description.getText().toString()
                );
                services.add(car);
                Intent i = new Intent(MainActivity.this, MaintenanceActivity.class);
                i.putExtra("list",services);
                startActivity(i);
            }
        });

    }
}
