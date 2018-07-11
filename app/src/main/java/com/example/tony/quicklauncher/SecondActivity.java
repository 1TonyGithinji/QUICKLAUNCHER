package com.example.anthony.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if (getIntent().hasExtra("com.example.tony.quicklauncher")){
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.tony.quicklauncher");
            tv.setText(text);
        }
    }
}
