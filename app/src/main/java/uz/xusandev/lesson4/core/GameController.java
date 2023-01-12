package uz.xusandev.lesson4.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class GameController {

    private ArrayList<QuestionData> questionData;
    private Date startDate;
    private int position = 0;
    private int totalCorrects = 0;
    private int totalMistakes = 0;
    private Date endDate;

    public GameController(ArrayList<QuestionData> questionData) {
        this.questionData = questionData;
        startDate = new Date();
    }

    public void startGame() {
        startDate = new Date();
    }

    public void endGame() {
        endDate = new Date();
    }

    public String getTotalSpentTime() {
        long deltaTime = Math.abs(startDate.getTime() - endDate.getTime());

        long second = deltaTime / 1000 % 60;
        long minute = deltaTime / 1000 / 60 % 60;
        long hour = deltaTime / 1000 / 60 / 60 % 24;

        String result = String.format("%02d:%02d:%02d", hour, minute, second);

        return result;
    }


    private QuestionData getCurrentQuestion() {
        return questionData.get(position);
    }

    public String getQuestion() {
        return getCurrentQuestion().getQuestion();
    }

    public ArrayList<String> getVariants() {
        Collections.shuffle(getCurrentQuestion().getVariants());
        return getCurrentQuestion().getVariants();
    }

    public int getTotalMistakes() {
        return totalMistakes;
    }

    public int getTotalCorrects() {
        return totalCorrects;
    }

    public int getTotalQuestions() {
        return questionData.size();
    }

    public boolean checkAnswer(String userAnswer) {
        boolean isTrue = getCurrentQuestion().getAnswer().equalsIgnoreCase(userAnswer);

        if (isTrue) {
            totalCorrects++;
        } else {
            totalMistakes++;
        }

        if (!isFinished()) {
            position++;
        }

        return isTrue;
    }

    public boolean isFinished() {
        return position == questionData.size();
    }

    public int getPosition() {
        return position + 1;
    }
}
