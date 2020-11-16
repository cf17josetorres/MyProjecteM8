package com.example.myprojectem8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuOpcion extends AppCompatActivity {

    public MenuOpcion() {
        // Required empty public constructor
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opcion);

        // Inflate the layout for this fragment
        View fMenu = inflater.inflate(R.layout.incidencia, container, false);

        Button btnAfegir = fMenu.findViewById(R.id.btnAfegir);
        btnAfegir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //Log.i("proves", "buttons afegir click");
                FragmentManager menuManager = getFragmentManager();
                FragmentTransaction menuTransaction = menuManager.beginTransaction();

                Fragment fAfegirIncidencia = new afegirincidencia();

                menuTransaction.replace(R.id.frameLayout, fAfegirIncidencia);

                menuTransaction.commit();
            }
        });

        Button btnLlistar = fMenu.findViewById(R.id.btnLlistar);
        btnLlistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager menuManager = getFragmentManager();
                FragmentTransaction menuTransaction = menuManager.beginTransaction();

                Fragment fLlistarIncidencia = new llistaincidencia();

                menuTransaction.replace(R.id.frameLayout2, fLlistarIncidencia);

                menuTransaction.commit();
            }
        });

        Button btnEliminar = fMenu.findViewById(R.id.btnEliminar);
        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager menuManager = getFragmentManager();
                FragmentTransaction menuTransaction = menuManager.beginTransaction();

                Fragment feliminar = new eliminar();

                menuTransaction.replace(R.id.frameLayout3, feliminar);

                menuTransaction.commit();
            }
        });

        return fMenu;
    }
    }
}