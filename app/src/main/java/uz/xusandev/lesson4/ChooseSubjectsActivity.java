package uz.xusandev.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseSubjectsActivity extends AppCompatActivity {

    private Button btnProgram, btnMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subjects);

        btnProgram = findViewById(R.id.btn_programming);

        btnMath = findViewById(R.id.btn_math);

        btnProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseSubjectsActivity.this, TestGameActivity.class);
                startActivity(intent);
            }
        });

        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseSubjectsActivity.this, MathematicsQuizActivity.class);
                startActivity(intent);
            }
        });


    }

    private void loadView() {
        btnProgram = findViewById(R.id.btn_programming);
        btnMath = findViewById(R.id.btn_math);
    }

}