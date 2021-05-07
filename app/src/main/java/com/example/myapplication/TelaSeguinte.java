package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaSeguinte extends AppCompatActivity {

    private Button buttonVoltar;
    private TextView textLiberado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_seguinte);

        buttonVoltar = findViewById(R.id.buttonVoltar);
        textLiberado = findViewById(R.id.textLiberado);

        Bundle dados = getIntent().getExtras();
        String rg = dados.getString("rg");

        textLiberado.setText(rg);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}