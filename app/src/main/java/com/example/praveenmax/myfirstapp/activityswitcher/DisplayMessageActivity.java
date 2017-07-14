package com.example.praveenmax.myfirstapp.activityswitcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.praveenmax.myfirstapp.R;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_display_message);

        Intent intent = getIntent();
        String receivedMessage = intent.getStringExtra(MainActivitySwitcher.EXTRA_MESSAGE);

        EditText editText = (EditText)findViewById(R.id.editText5);
        editText.setText(receivedMessage);
    }
}
