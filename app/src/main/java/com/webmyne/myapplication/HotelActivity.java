package com.webmyne.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class HotelActivity extends AppCompatActivity {


    private ImageView imageHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        Toolbar toolbar = (Toolbar) findViewById(R.id.hoteltoolbar);
        setSupportActionBar(toolbar);

        initi();


    }

    private void initi() {

        imageHotel = (ImageView) findViewById(R.id.imageHotel);


        clickListener();

    }

    private void clickListener() {

        imageHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FullScreenActivity.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(HotelActivity.this, imageHotel, "profile");
                    startActivity(intent, options.toBundle());
                } else {
                    startActivity(intent);
                }

            }
        });

    }
}
