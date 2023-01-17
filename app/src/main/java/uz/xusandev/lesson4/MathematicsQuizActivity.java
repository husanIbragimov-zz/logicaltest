package uz.xusandev.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import uz.xusandev.lesson4.core.GameController;
import uz.xusandev.lesson4.core.MathDataLoader;

public class MathematicsQuizActivity extends AppCompatActivity {

    public GameController gameController;
    private TextView totalView, orderView, timeView, questionView;
    private RadioGroup answerGroup;
    private Button nextButton, closeButton;
    private String answerText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_game);

        gameController = new GameController(MathDataLoader.makeData());

        gameController.startGame();

        loadView();

        loadDataView();

        loadActions();

    }

    private void loadActions() {
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MathematicsQuizActivity.this, "Close clicked", Toast.LENGTH_SHORT).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Bu yerda tekshiriladi

                if (gameController.isFinished()) {
                    // Yangi oyna ochib oxirgi malumotlarni ko'rsatishimiz kerak!
                    startResultsActivity();
                    return;
                }

                if (answerText.isEmpty()) {
                    Toast.makeText(MathematicsQuizActivity.this, "At first, You should choose one answer!!!", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isFind = gameController.checkAnswer(answerText);

                    if (isFind) {
                        Toast.makeText(MathematicsQuizActivity.this, "Good baby", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MathematicsQuizActivity.this, "Bad baby", Toast.LENGTH_SHORT).show();
                    }

                    if (!gameController.isFinished()) {
                        loadDataView();
                    } else {
                        nextButton.setText("FINISH");
                    }

                }
            }
        });

        for (int i = 0; i < answerGroup.getChildCount(); i++) {
            RadioButton answerButton = (RadioButton) answerGroup.getChildAt(i);

            answerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MathematicsQuizActivity.this.answerText = answerButton.getText().toString();
                }
            });
        }

    }

    private void loadDataView() {

        answerGroup.clearCheck();
        answerText = "";

        String order = "Question: " + gameController.getPosition();

        String question = gameController.getQuestion();

        ArrayList<String> variants = gameController.getVariants();

        orderView.setText(order);
        totalView.setText(String.valueOf(gameController.getTotalQuestions()));

        questionView.setText(question);

        for (int i = 0; i < answerGroup.getChildCount(); i++) {

            RadioButton answerButton = (RadioButton) answerGroup.getChildAt(i);

            if (i < variants.size()) {
                answerButton.setText(variants.get(i));
                answerButton.setVisibility(View.VISIBLE);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            } else {
                answerButton.setText(" ");
                answerButton.setVisibility(View.GONE);
            }

        }

    }

    private void loadView() {
        totalView = findViewById(R.id.total_view);
        orderView = findViewById(R.id.order_view);
        timeView = findViewById(R.id.time_view);
        questionView = findViewById(R.id.question_view);
        questionView = findViewById(R.id.question_view);
        questionView = findViewById(R.id.question_view);
        answerGroup = findViewById(R.id.answer_group);
        closeButton = findViewById(R.id.close_btn);
        nextButton = findViewById(R.id.next_btn);
    }

    private void startResultsActivity() {

        gameController.endGame();

        Intent intent = new Intent(this, ResultsActivity.class);

        Bundle bundle = new Bundle();

        bundle.putString("total_time", gameController.getTotalSpentTime());
        bundle.putInt("total_question", gameController.getTotalQuestions());
        bundle.putInt("total_corrects", gameController.getTotalCorrects());

        intent.putExtras(bundle);

        startActivity(intent);
        finish();
    }
}