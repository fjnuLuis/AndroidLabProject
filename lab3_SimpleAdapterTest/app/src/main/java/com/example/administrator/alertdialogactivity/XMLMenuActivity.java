package com.example.administrator.alertdialogactivity;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class XMLMenuActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlmenu);

        textView=(TextView)findViewById(R.id.testContext);
        registerForContextMenu(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_style,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        if(mi.isCheckable())
            mi.setChecked(true);
        switch (mi.getItemId()){
            case R.id.fontBig:
                textView.setTextSize(20*2);
                break;
            case R.id.fontMedium:
                textView.setTextSize(16*2);
                break;
            case R.id.fontSmall:
                textView.setTextSize(10*2);
                break;
            case R.id.fontBlack:
                textView.setTextColor(Color.BLACK);
                break;
            case R.id.fontRed:
                textView.setTextColor(Color.RED);
                break;
            case R.id.common:
                Toast.makeText(XMLMenuActivity.this,
                        "您单击了普通菜单项",Toast.LENGTH_SHORT)
                        .show();
                break;

        }
        return  true;
    }
}
