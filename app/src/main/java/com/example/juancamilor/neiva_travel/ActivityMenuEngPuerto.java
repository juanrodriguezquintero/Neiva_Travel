package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEngPuerto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_puerto);

        ImageButton imgBtnWebPuertoCaracoli = (ImageButton) findViewById(R.id.imgBtnWebPuertoCaracoli);
        imgBtnWebPuertoCaracoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEngPuerto.this, ActivityMenuEspPuertoWeb.class);
                startActivity(intent);
            }
        });

    }
}
