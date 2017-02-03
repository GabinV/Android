package com.example.gabinventrinponte.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button buttonAjouter = (Button) findViewById(R.id.buttonAjouter);
        buttonAjouter.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, Ajouter_raid.class);
                startActivity(intent);
            }
        });

        final Button buttonDecon = (Button) findViewById(R.id.buttonDecon);
        buttonDecon.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, Connexion.class);
                startActivity(intent);
            }
        });
    }
}
