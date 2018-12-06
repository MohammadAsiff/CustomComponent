package com.example.utsav.customcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView simpleText = (TextView) findViewById(R.id.simple);
        simpleText.setText("That is a simple TextView");
    }

}
