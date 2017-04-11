package com.example.administrator.mywebbrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Uri data = getIntent().getData();
      //  WebView wv=(WebView) R.id.myBrowser

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                EditText text = (EditText) findViewById(R.id.edit);
                String data =text.getText().toString();
                intent.setAction(Intent.ACTION_VIEW);
                intent.putExtra("url",data);
                startActivity(intent);
            }
        });
    }
}
