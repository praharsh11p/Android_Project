package com.example.volume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<CustomShape> shapeArrayList;
    Custom adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView = findViewById(R.id.Grid);
        shapeArrayList = new ArrayList<>();

        CustomShape s1 = new CustomShape(R.drawable.sphere, "Sphere");
        CustomShape s2 = new CustomShape(R.drawable.cylinder, "Cylinder");
        CustomShape s3 = new CustomShape(R.drawable.cube, "Cube");
        CustomShape s4 = new CustomShape(R.drawable.prism, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new Custom(shapeArrayList, this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), sphere.class);
                startActivity(i);
                Intent in = new Intent(getApplicationContext(),cube.class);
                startActivity(in);
                Intent intt = new Intent(getApplicationContext(),Cylinder.class);
                startActivity(intt);
                Intent inttt = new Intent(getApplicationContext(),Prism.class);
                startActivity(inttt);
            }
        });
    }
}
