package com.example.gabinventrinponte.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        final Button buttonComm = (Button) findViewById(R.id.buttonConn);
        buttonComm.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Connexion.this, Menu.class);
                startActivity(intent);
            }
        });

        final Button buttonCompte = (Button) findViewById(R.id.buttonCompte);
        buttonCompte.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Connexion.this, Menu.class);
                startActivity(intent);
            }
        });

        final Button buttonRetour = (Button) findViewById(R.id.buttonRetour);
        buttonRetour.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Connexion.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
