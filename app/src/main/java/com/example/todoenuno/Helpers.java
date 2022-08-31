package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Helpers extends AppCompatActivity {

    Button btnGroup;
    Button btnFlow;
    Button btnMockview;
    Button btnGuideline, btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpers_main);

        btnGroup = findViewById(R.id.btnGroupMenuHelpers);
        btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Group.class);
                startActivity(intent);
            }
        });

        btnFlow = findViewById(R.id.btnFlowMenuHelpers);
        btnFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Flow.class);
                startActivity(intent);
            }
        });

        btnMockview = findViewById(R.id.btnMockviewMenuHelpers);
        btnMockview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Mockview.class);
                startActivity(intent);
            }
        });

        btnGuideline = findViewById(R.id.btnGuidelineMenuHelpers);
        btnGuideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Guideline.class);
                startActivity(intent);
            }
        });

        btnregresar = findViewById(R.id.btnHregresar);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Inicio.class);
                startActivity(intent);
            }
        });
    }
}