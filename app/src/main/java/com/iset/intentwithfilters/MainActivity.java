package com.iset.intentwithfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_FILTRE_ACTIVITE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent broadcast = new Intent("admin.broadcast");
                broadcast.putExtra("extra", "Filtrage d'un intent par activité");
                sendBroadcast(broadcast);
                startActivity(broadcast);
            }
        });
    }
}