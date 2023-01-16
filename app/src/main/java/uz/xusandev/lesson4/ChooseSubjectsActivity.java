package uz.xusandev.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ChooseSubjectsActivity extends AppCompatActivity {

    private Button btnProgram, btnMath, btnMix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subjects);


    }

    private void loadView() {
        btnProgram = findViewById(R.id.btn_programming);
        btnMath = findViewById(R.id.btn_math);
        btnMix = findViewById(R.id.btn_mix);
    }

}