package com.example.uddd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QlmonhocMainActivity extends AppCompatActivity {
    Button btnClickback;
    Button btnAddmonhoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qlmonhoc_main);

        btnClickback = findViewById(R.id.btnClickback);
        btnClickback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QlmonhocMainActivity.this, TrangchuPgvActivity.class);
                startActivity(intent);
            }
        });

        btnAddmonhoc = findViewById(R.id.btnAddmonhoc);
        btnAddmonhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QlmonhocMainActivity.this, QlmonhocTaomonhocActivity.class);
                startActivity(intent);
            }
        });
    }
}