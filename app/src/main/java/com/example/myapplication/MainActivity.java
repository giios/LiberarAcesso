package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonLiberar;
    private TextInputEditText textImputRG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLiberar = findViewById(R.id.buttonLiberar);
        textImputRG = findViewById(R.id.textImputRG);

        buttonLiberar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TelaSeguinte.class);

                String rg = textImputRG.getText().toString();
                intent.putExtra("rg", rg);



                startActivity(intent);
            }
        });

    }
}