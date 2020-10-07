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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner =findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        final Button button = findViewById(R.id.LOGIN);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        //final TextView resultat = findViewById(R.id.resultat)

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Log.i("btn click", "El boton de login ha estat clicat");

                String textPersonName = username.getText().toString();
                String textPassword = password.getText().toString();


                if (textPersonName.equals("admin") && textPassword.equals("admin")) {
                    //Login ok
                    //resultat.setText("Login ok");
                    ArrayList<Incidencia> arrayIncidencia = new ArrayList<Incidencia>();
                    Incidencia incidencia = new Incidencia("Fallo!", "Alta");

                } else {
                    //Login KO
                    //resultat.setText("Login ko");
                }
            }
        });
    }

    public void goToMenu(View view) {
        Intent intent = new Intent(this, MenuOpcion.class);
        EditText editText = (EditText) findViewById(R.id.password);
        String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}