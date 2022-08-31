package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    Button creditos, salir, widgets, textos, botones, layouts, helpers, contenedor, mapa, legacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);

        textos = findViewById(R.id.btnTexto);
        textos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Textos.class);
                startActivity(intent);
            }
        });

        botones = findViewById(R.id.btnBoton);
        botones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Botones.class);
                startActivity(intent);
            }
        });

        layouts = findViewById(R.id.btnLayouts);
        layouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Layout.class);
                startActivity(intent);
            }
        });

        widgets = findViewById(R.id.btnWidgets);
        widgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Widgets.class);
                startActivity(intent);
            }
        });

        helpers = findViewById(R.id.btnHelpers);
        helpers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Helpers.class);
                startActivity(intent);
            }
        });

        contenedor = findViewById(R.id.btnContainers);
        contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Contenedores.class);
                startActivity(intent);
            }
        });

        mapa = findViewById(R.id.btnGoogle);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), mapa.class);
                startActivity(intent);
            }
        });

        legacy = findViewById(R.id.btnLegacy);
        legacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Legacy.class);
                startActivity(intent);
            }
        });

        creditos = findViewById(R.id.btnAcercade);
        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCreditos();
            }
        });

        salir = findViewById(R.id.btnSalida);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Inicio.this, "Cerrando aplicación", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
    }

    public void getCreditos(){
        new AlertDialog.Builder(this).setTitle("Acerca de").setMessage("" + "Carlos Alberto Hernández Velázquez \n"
                + "Aplicación todo en uno\n" + "Programación Android :D \n" + "Versión 1.0\n" + "Amo programar").setPositiveButton("Aceptar", null).show();
    }
}