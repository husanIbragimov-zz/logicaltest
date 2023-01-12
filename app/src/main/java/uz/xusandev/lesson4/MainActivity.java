package uz.xusandev.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay, btnAbout, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btn_play);

        btnAbout = findViewById(R.id.btn_about);

        btnExit = findViewById(R.id.btn_exit);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("======================================== Hello Android Developer Play Button ========================================");

                Intent intent = new Intent(MainActivity.this, TestGameActivity.class);

                startActivity(intent);

            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("======================================== Hello Android Developer About Button ========================================");

                Intent intent = new Intent(MainActivity.this, AboutAppActivity.class);

                startActivity(intent);

            }
        });

    }
}