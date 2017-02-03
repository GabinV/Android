package com.example.gabinventrinponte.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Ajouter_raid2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_raid2);
    }

    ListRaid2 mListView;
    String[] raid = new String[]{
            "Bastion de Baradin", "Descente de l'Aile noire", "Le Bastion du Crepuscule", "L'âme des dragons", "Terre de Feu ", "Trône des quatres vents",
            "Caverne Mogu'shan", "Coeur de la peur", "Siege d'Orgrimmar", "Terrasse Printanière ", "Trône du tonnerre"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListRaid2) findViewById(R.id.ListRaid2);

        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Ajouter_raid2.this,
                android.R.layout.simple_list_item_1, raid);
        mListView.setAdapter(adapter);
    }
}
}
