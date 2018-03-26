package com.example.imac5.liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button buttonConnect;
    public Button buttonSubscribe;


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





    }
}