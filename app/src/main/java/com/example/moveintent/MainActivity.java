package com.example.moveintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove , btnMove1, btnMove2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.profile);
        btnMove.setOnClickListener(this);

        btnMove1 = findViewById(R.id.order);
        btnMove1.setOnClickListener(this);

        btnMove2 = findViewById(R.id.galeri);
        btnMove2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.profile:
                startActivity(new Intent(this, SecondActivity.class));
                break;

            case R.id.order:
                startActivity(new Intent(this, kopi.class));
                break;

            case R.id.galeri:
                startActivity(new Intent(this, Activity_four.class));
                break;
        }
    }
}
