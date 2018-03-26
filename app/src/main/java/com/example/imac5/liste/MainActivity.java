package com.example.imac5.liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button buttonConnect;
    public Button buttonSubscribe;
    public Button buttonValid;
    public Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        buttonConnect = (Button) findViewById(R.id.connect);
//        buttonConnect.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,StandingsActivity.class));
//            }
//        });

        buttonSubscribe = (Button) findViewById(R.id.inscription);
        buttonSubscribe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InscriptionActivity.class));
            }
        });

        buttonConnect = (Button) findViewById(R.id.connexion);
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConnexionActivity.class));
            }
        });

        buttonValid = (Button) findViewById(R.id.valid) ;
        buttonValid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InscriptionActivity.class));

            }
        });

        buttonRetour = (Button) findViewById(R.id.retour);
        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ErrorActivity.class));
            }
        });


    }
}