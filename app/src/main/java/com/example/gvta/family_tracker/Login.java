package com.example.gvta.family_tracker;

import android.content.Intent;
import android.service.voice.VoiceInteractionService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class Login extends AppCompatActivity {
      private EditText e1,e2;
      Button b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button b3;
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button7);
        b5=(Button)findViewById(R.id.button6);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(e1.getText().toString(),e2.getText().toString());

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }

    private void validate(String username, String password) {
     if((username.equals("Admin")) && (password.equals("1234")))
     {
         Intent intent=new Intent(Login.this,Geolocation.class);
         startActivity(intent);

     }
        else
     {

         Toast.makeText(Login.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();

     }
    }
}
