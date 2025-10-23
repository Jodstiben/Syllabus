package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class TermActivity extends AppCompatActivity {
    String semester, term;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term);

        semester = getIntent().getStringExtra("SEMESTER");
        term = getIntent().getStringExtra("TERM");

        ListView listView = findViewById(R.id.listSubjects);

        String[] subjects = {
                "Mathematics",
                "Programming",
                "Database Systems",
                "English",
                "Computer Networks"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                subjects
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, position, id) -> {
            String subject = subjects[position];
            Intent intent = new Intent(TermActivity.this, SyllabusActivity.class);
            intent.putExtra("SEMESTER", semester);
            intent.putExtra("TERM", term);
            intent.putExtra("SUBJECT", subject);
            startActivity(intent);
        });
    }
}

