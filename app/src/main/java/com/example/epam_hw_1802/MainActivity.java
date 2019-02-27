package com.example.epam_hw_1802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView HW1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HW1= (TextView)findViewById(R.id.text);
    }

    public void onClickButton(View v){
        Button button=(Button) v;
        HW1.setText(R.id.button1);

    }
}