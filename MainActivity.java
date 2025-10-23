package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSem1 = findViewById(R.id.btnSem1);
        Button btnSem2 = findViewById(R.id.btnSem2);
        Button btnSem3 = findViewById(R.id.btnSem3);
        Button btnSem4 = findViewbyId(R.id.btnSem4);

        btnSem1.setOnClickListener(v -> openSemester("1st Semester"));
        btnSem2.setOnClickListener(v -> openSemester("2nd Semester"));
        btnSem3.setOnClickListener(v -> openSemester("3rd Semester"));
    }

    private void openSemester(String semester) {
        Intent intent = new Intent(MainActivity.this, SemesterActivity.class);
        intent.putExtra("SEMESTER", semester);
        startActivity(intent);
    }
}
