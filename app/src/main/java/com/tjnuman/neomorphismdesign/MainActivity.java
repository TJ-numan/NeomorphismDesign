package com.tjnuman.neomorphismdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {
    NeumorphCardView neumorphCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        neumorphCardView = findViewById(R.id.firstButton);

    neumorphCardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
        }
    });
    }

}