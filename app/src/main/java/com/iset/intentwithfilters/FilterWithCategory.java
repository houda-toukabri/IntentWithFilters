package com.iset.intentwithfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FilterWithCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_with_category);

        TextView txt = findViewById(R.id.textView_filtre_categorie);
        txt.setText("Filtrage d'un intent par catégorie");
    }
}