package com.example.tomas1207.resturante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseApp firebaseApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 0;

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Pessoa");
        Pessoas pessoas = new Pessoas("Tomas","Fernandes",20, true);
        myRef.push().setValue(new Pessoas("Ze","Cenas", 69,false));
    }
}
