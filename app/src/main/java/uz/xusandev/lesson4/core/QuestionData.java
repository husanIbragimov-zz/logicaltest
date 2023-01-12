package uz.xusandev.lesson4.core;

import java.util.ArrayList;

public class QuestionData {
    private String question;
    private String answer;
    private ArrayList<String> variants;

    public QuestionData(String question, String answer) {
        this.question = question;
        this.answer = answer;
        variants = new ArrayList<>();
    }

    public void addVariant(String variant) {
        variants.add(variant);
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getVariants() {
        return variants;
    }

}
