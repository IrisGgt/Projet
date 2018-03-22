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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        txtName = (EditText) findViewById(R.id.name);

//        buttonSubscribe = (Button) findViewById(R.id.inscription);
//        buttonSubscribe.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                validateForm();
//            }
//        });

    }

    public void validateForm() {
        if (txtName.getText().length()==0) {
            // faire le truc de quand il a pas saisi
        }
    }
}
