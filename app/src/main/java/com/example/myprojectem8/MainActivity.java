package com.example.myprojectem8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button LOGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Spinner spinner =findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Lista, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);*/

        LOGIN = findViewById(R.id.LOGIN);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Users user = new Users();
                if ((username.getText().toString().trim().equals(user.getUsername())) && (password.getText().toString().trim().equals(user.getPassword()))){
                    gotomenu();
                }
                else{
                    Snackbar.make(v, "Datos introducidos incorrectamente", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }

    public void gotomenu(){
        Intent intent = new Intent (MainActivity.this, MenuOpcion.class);
        startActivity(intent);
    }
}