package com.example.praveenmax.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String receivedMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        EditText editText = (EditText)findViewById(R.id.editText5);
        editText.setText(receivedMessage);
    }
}
