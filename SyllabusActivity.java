package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SyllabusActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        String semester = getIntent().getStringExtra("SEMESTER");
        String term = getIntent().getStringExtra("TERM");
        String subject = getIntent().getStringExtra("SUBJECT");

        TextView textView = findViewById(R.id.txtSyllabus);

        String syllabusText = "Syllabus for " + subject + "\n\n"
                + "Semester: " + semester + "\n"
                + "Term: " + term + "\n\n"
                + "• Introduction\n"
                + "• Lessons Overview\n"
                + "• Assessments\n"
                + "• Grading Criteria\n";

        textView.setText(syllabusText);
    }
}
