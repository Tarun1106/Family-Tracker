package com.example.gvta.family_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2;


            setContentView(R.layout.activity_main);
            b1=(Button)findViewById(R.id.button);
            b2=(Button)findViewById(R.id.button2);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this,Login.class);
                    startActivity(intent);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this,Register.class);
                    startActivity(intent);
                }
            });
    }
}
