package com.example.ly139.layouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainRelativeTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative_test);
        Button b=(Button)findViewById(R.id.btn_style3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainRelativeTestActivity.this,MainTableLayoutActivity.class);
                startActivity(intent);

            }
        });
    }


}
