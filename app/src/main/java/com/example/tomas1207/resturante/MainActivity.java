package com.example.tomas1207.resturante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tomas1207.resturante.Activity.Registar;

public class MainActivity extends AppCompatActivity {

    private Button Regsitar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 0;

        Regsitar = (Button) findViewById(R.id.BTN_Registar);
        Regsitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Registar.class));
            }
        });

    }
}
