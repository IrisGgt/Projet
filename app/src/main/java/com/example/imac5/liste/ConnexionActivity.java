package com.example.imac5.liste;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConnexionActivity extends AppCompatActivity {


    public Button buttonConnexion;
    public EditText txtEmail;
    public EditText txtPassword;
    public SharedPreferences share;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        share = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        txtEmail = (EditText) findViewById(R.id.email);
        txtPassword = (EditText) findViewById(R.id.password);



        buttonConnexion = (Button) findViewById(R.id.connexion);
        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateForm()==1) {
                    share.edit()
                            .putString("email_2",txtEmail.getText().toString())
                            .putString("password",txtPassword.getText().toString())
                            .apply();

                
                startActivity(new Intent(ConnexionActivity.this, WelcomeActivity.class));
            }else{
                startActivity(new Intent(ConnexionActivity.this, ErrorActivity.class));
            }
            }
        });
    }

    public int validateForm() {
        int retour = 1;

        if (txtEmail.getText().length()==0) {
            retour = 0;
        }
        if (txtPassword.getText().length()==0) {
            retour = 0;
        }

        return retour;
    }

}
