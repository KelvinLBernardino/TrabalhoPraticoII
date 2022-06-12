package com.example.trabalhopraticoii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {
    Button listConsulta, listCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listConsulta = findViewById(R.id.button10);
        listCancelar = findViewById(R.id.button11);

        listConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Consultar
            }
        });

        listCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListActivity.this.finish();
            }
        });
    }
}