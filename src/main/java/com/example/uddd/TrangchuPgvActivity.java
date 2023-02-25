package com.example.uddd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrangchuPgvActivity extends AppCompatActivity {
    Button btnMonhoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu_pgv);

        btnMonhoc = findViewById(R.id.btnMonhoc);
        btnMonhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrangchuPgvActivity.this, QlmonhocMainActivity.class);
                startActivity(intent);
            }
        });
    }
}