package com.iset.intentwithfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FilterWithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_with_activity);

        Intent broadcast = getIntent();
        Bundle extra = broadcast.getExtras();
        String val = extra.getString("extra");

        TextView txt = findViewById(R.id.textView_message_broadcast);
        txt.setText(val);
    }
}