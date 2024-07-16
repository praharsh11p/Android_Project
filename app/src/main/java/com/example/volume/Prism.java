package com.example.volume;

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

public class Prism extends AppCompatActivity {
    TextView prism_text,prism_result;
    EditText prism_height,prism_base,prism_length;
    Button prism_cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        prism_base=findViewById(R.id.prism_base);
        prism_cal=findViewById(R.id.prism_cal);
        prism_height=findViewById(R.id.prism_height);
        prism_text=findViewById(R.id.prism_text);
        prism_length=findViewById(R.id.prism_length);
        prism_result=findViewById(R.id.prism_result);
        prism_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base = prism_base.getText().toString();
                String height = prism_height.getText().toString();
                String length = prism_length.getText().toString();
                int b = Integer.parseInt(base);
                int l = Integer.parseInt(length);
                int h = Integer.parseInt(height);
                double volume =  0.5 * b * h * l;
                prism_result.setText("V= "+volume+"m^3");
            }
        });

    }
}