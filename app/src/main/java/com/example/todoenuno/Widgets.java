package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Widgets extends AppCompatActivity {

    Button regresar, imageview, video, webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        regresar = findViewById(R.id.Wvolver);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Inicio.class);
                startActivity(intent);
            }
        });

        video = findViewById(R.id.Wvid);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Videoview.class);
                startActivity(intent);
            }
        });

        webview = findViewById(R.id.WPag);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), webview.class);
                startActivity(intent);
            }
        });

    }


}