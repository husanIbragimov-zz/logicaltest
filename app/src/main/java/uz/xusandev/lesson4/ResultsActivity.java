package uz.xusandev.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    private TextView totalTimeView, totalQuestionView, totalCorrectsView;

    private String totalSpentTimeTxt;
    private int totalQuestion;
    private int totalCorrects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        totalSpentTimeTxt = bundle.getString("total_time");
        totalQuestion = bundle.getInt("total_question");
        totalCorrects = bundle.getInt("total_corrects");

        loadView();
        loadDataToView();

    }

    private void loadDataToView() {

        totalCorrectsView.setText("You have a total of " + totalCorrects + " correct answer 😍");
        totalTimeView.setText("You spent " + totalSpentTimeTxt + " time");
        totalQuestionView.setText("You were gave " + totalQuestion + " questions");

    }

    private void loadView() {
        totalCorrectsView = findViewById(R.id.total_answers_txt);
        totalQuestionView = findViewById(R.id.total_questions_txt);
        totalTimeView = findViewById(R.id.total_time_txt);
    }
}