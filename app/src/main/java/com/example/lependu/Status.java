package com.example.lependu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Status extends AppCompatActivity {
    TextView message;
    Button btn_rejouer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        message = findViewById(R.id.msg);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Récupérer le mot
            String mot = extras.getString("MOT");
        String texte = "Le mot à deviner était " + mot;
        message.setText(texte);
        }
    }
    public void rejouer(View view){
    finish(); // permet de revenir a l'activité principal et en appuyant sur le bouton rejouer on peu relancer le pendu.
    }

}