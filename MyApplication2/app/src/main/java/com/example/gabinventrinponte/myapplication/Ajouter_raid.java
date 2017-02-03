package com.example.gabinventrinponte.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ajouter_raid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_raid);

        final Button buttonMenu = (Button) findViewById(R.id.buttonMenu);
        buttonMenu.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Ajouter_raid.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}
