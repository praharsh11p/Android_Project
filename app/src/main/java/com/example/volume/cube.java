package com.example.volume;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cube extends AppCompatActivity {
    TextView cub_title,cub_result;
    Button cub_btn;
    EditText cub_side;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cub_title = findViewById(R.id.cube_title);
        cub_result = findViewById(R.id.cube_result);
        cub_btn = findViewById(R.id.cube_btn);
        cub_side = findViewById(R.id.cube_side);
        cub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String side = cub_side.getText().toString();
                int s = Integer.parseInt(side);
                double volume = s*s*s;
                cub_result.setText("V= "+volume+"m^3");


            }
        });
    }
}