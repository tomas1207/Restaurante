package com.example.tomas1207.resturante.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tomas1207.resturante.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registemail extends AppCompatActivity {
private Button BntRegiter;
private EditText Email,Pass;private String Emails,Passs;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registemail);
        mAuth = FirebaseAuth.getInstance();
        BntRegiter = (Button) findViewById(R.id.BNT_RegistarFire);
        Email = (EditText) findViewById(R.id.ET_Email);
        Pass = (EditText) findViewById(R.id.ET_Pass);
        Emails = Email.getText().toString();
        Passs = Pass.getText().toString();
        BntRegiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mAuth.createUserWithEmailAndPassword(Email.getText().toString(),Pass.getText().toString()).addOnCompleteListener(Registemail.this,new OnCompleteListener<AuthResult>(){

                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (!task.isSuccessful()) {

                    } else {

                        startActivity(new Intent(Registemail.this, Registar.class));

                    }
                }
            });
            }
        });
    }

}
