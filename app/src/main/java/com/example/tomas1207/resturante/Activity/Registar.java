package com.example.tomas1207.resturante.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.tomas1207.resturante.Core.Pessoas;
import com.example.tomas1207.resturante.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registar extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseApp firebaseApp;
    private ImageButton RegistarFire;
    private EditText Nome,SobreNome,Idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);
        RegistarFire = (ImageButton) findViewById(R.id.BTN_RegistarFire);
        Nome = (EditText) findViewById(R.id.ET_Nome);
        SobreNome = (EditText) findViewById(R.id.ET_SobreNome);
        Idade = (EditText) findViewById(R.id.ET_Idade);

        RegistarFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database = FirebaseDatabase.getInstance();
                myRef = database.getReference("Pessoa");
                Pessoas pessoas = new Pessoas(Nome.getText().toString(),SobreNome.getText().toString(), Integer.parseInt(Idade.getText().toString()), false);

                myRef.push().setValue(pessoas);
            }
        });




    }
}
