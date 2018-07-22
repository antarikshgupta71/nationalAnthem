package com.example.aloofwillow.nationalanthems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ScrollBar;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        Button login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().equals("antariksh") && password.getText().toString().equals("antariksh")) {
                    Toast.makeText(MainActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),CountriesActivity.class));
                }
                else
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
