package com.oyinloyeayodeji.www.mycarshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PayActivity extends AppCompatActivity {

    TextView totalPayment;
    int payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        totalPayment = (TextView)findViewById(R.id.total) ;
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            payment = extras.getInt("total");
        }

        totalPayment.setText(String.valueOf(payment));
    }
}
