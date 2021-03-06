package com.webmyne.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_signin;
    private Button btn_order;
    private Button btn_item;
    private Button btn_hotel;
    private Button btn_demo;
    private Button btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        clickListener();
    }

    private void clickListener() {
        btn_signin.setOnClickListener(this);
        btn_order.setOnClickListener(this);
        btn_item.setOnClickListener(this);
        btn_hotel.setOnClickListener(this);
        btn_demo.setOnClickListener(this);
        btn_profile.setOnClickListener(this);
    }

    private void init() {
        btn_signin = (Button) findViewById(R.id.btn_signin);
        btn_order = (Button) findViewById(R.id.btn_order);
        btn_item = (Button) findViewById(R.id.btn_item);
        btn_hotel = (Button) findViewById(R.id.btn_hotel);
        btn_demo = (Button) findViewById(R.id.btn_demo);
        btn_profile = (Button) findViewById(R.id.btn_profile);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_signin:
                Intent intentSign = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intentSign);
                break;

            case R.id.btn_order:
                Intent intentOrder = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intentOrder);
                break;

            case R.id.btn_item:
                Intent intentItem = new Intent(getApplicationContext(), FoodItemActivity.class);
                startActivity(intentItem);
                break;

            case R.id.btn_hotel:
                Intent intenthotel = new Intent(getApplicationContext(), HotelActivity.class);
                startActivity(intenthotel);
                break;
            case R.id.btn_demo:
                Intent intentdemo = new Intent(getApplicationContext(), DemoActivity.class);
                startActivity(intentdemo);
                break;
            case R.id.btn_profile:
                Intent intentprofile = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intentprofile);
                break;
        }
    }
}
