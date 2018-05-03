package com.example.imac5.liste;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    public SharedPreferences share;
    public Button buttonAccess;
    public TextView introduction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        share = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        introduction = (TextView) findViewById(R.id.introduction);
        introduction.setText("Bienvenue " + share.getString("name","") + " sur votre espace VYBZ !");

        buttonAccess = (Button) findViewById(R.id.access);
        buttonAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, MssgActivity.class));
            }
        });

    }
}
