package com.example.imac5.liste;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InscriptionActivity extends AppCompatActivity {

    public Button buttonConnect;
    public Button buttonSubscribe;
    public EditText txtName;
    public EditText txtEmail;
    public EditText txtAge;
    public EditText txtTel;

    public Button buttonValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        txtName = (EditText) findViewById(R.id.name);
        txtEmail = (EditText) findViewById(R.id.email_1);
        txtAge = (EditText) findViewById(R.id.age);
        txtTel = (EditText) findViewById(R.id.tel);

        buttonValid = (Button) findViewById(R.id.valid) ;
        buttonValid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (validateForm()==1) {
                    // ici shareobject
                    startActivity(new Intent(InscriptionActivity.this, WelcomeActivity.class));
                }else{
                    startActivity(new Intent(InscriptionActivity.this, ErrorActivity.class));
                }
            }
        });

    }

    public int validateForm() {
        int retour = 1;

        if (txtName.getText().length()==0) {
            retour = 0;
        }
        if (txtEmail.getText().length()==0) {
            retour = 0;
        }
        if (txtAge.getText().length()==0) {
            retour = 0;
        }
        if (txtTel.getText().length()==0) {
            retour = 0;
        }
        return retour;
    }

}
