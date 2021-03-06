package com.example.boonda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class ToughTopicsActivity extends AppCompatActivity {
    Button btnAddQuestion;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toughtopics_discussion);

        btnAddQuestion = findViewById(R.id.btn_add_question);
        btnAddQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    private void openDialog(){
        ToughTopicsQuestionDialog questionDialog = new ToughTopicsQuestionDialog();
        questionDialog.show(getSupportFragmentManager(),"question dialog");
    }
}
