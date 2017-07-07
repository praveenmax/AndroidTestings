package com.example.praveenmax.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "praveenmax.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    //Called when the user taps send button
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText et= (EditText)findViewById(R.id.editText);
        String message = et.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
