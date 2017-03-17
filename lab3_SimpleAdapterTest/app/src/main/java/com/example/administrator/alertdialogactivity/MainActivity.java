package com.example.administrator.alertdialogactivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_simple=(Button)findViewById(R.id.showSimpleAdapt);
        btn_simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SimpleAdaptActivity.class);
                startActivity(intent);
            }
        });
        Button btn_menu=(Button)findViewById(R.id.showXmlMenu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,XMLMenuActivity.class);
                startActivity(intent);
            }
        });

        Button btn_action=(Button)findViewById(R.id.actionMode);
        btn_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ActionModeActivity.class);
                startActivity(intent);
            }
        });

    }

    public void showAlertDialog(View source){

        LinearLayout form=(LinearLayout)getLayoutInflater()
                .inflate(R.layout.alert_layout,null);
        new AlertDialog.Builder(this)
                .setView(form)
                .setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }

                })

                .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .create()
                .show();
     }

    public void showXmlMenu(View source){

    }


}
