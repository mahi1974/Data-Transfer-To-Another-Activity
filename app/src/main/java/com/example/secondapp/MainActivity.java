package com.example.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen = findViewById(R.id.button);
        TextView tbx=findViewById(R.id.editTextText);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(MainActivity.this,MainActivity2.class);
                String abc= tbx.getText().toString();
                newPage.putExtra("Second", abc);
                // Add extra data
                startActivity(newPage);
                //hello
            }
        });
    }
}