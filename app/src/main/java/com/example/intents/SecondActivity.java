package com.example.intents;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        String receivedMessage = bundle.getString("Message");
        EditText myMessage = (EditText) findViewById(R.id.editText);
        myMessage.setText(receivedMessage);
    }
}