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

public class Cylinder extends AppCompatActivity {

    TextView cylinder_text,cylinder_result;
    EditText cylinder_radius,cylinder_height;
    Button cylinder_cal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cylinder_cal=findViewById(R.id.cylinder_cal);
        cylinder_height=findViewById(R.id.cylinder_height);
        cylinder_radius=findViewById(R.id.cylinder_radius);
        cylinder_text=findViewById(R.id.cylinder_text);
        cylinder_result=findViewById(R.id.cylinder_result);
        cylinder_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();
                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);
                double volume =  3.14159 * r*r *h;
                cylinder_result.setText("V= "+volume+"m^3");
            }
        });

    }
}