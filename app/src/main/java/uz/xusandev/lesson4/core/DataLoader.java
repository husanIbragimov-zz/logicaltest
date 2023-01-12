package uz.xusandev.lesson4.core;

import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<QuestionData> makeData() {
        ArrayList<QuestionData> data = new ArrayList<>();

        QuestionData questionData1 = new QuestionData("1 + 1 = ?", "2");
        questionData1.addVariant("2");
        questionData1.addVariant("1");
        questionData1.addVariant("5");
        questionData1.addVariant("9");
        data.add(questionData1);

        QuestionData questionData2 = new QuestionData("11 * 2 = ?", "22");
        questionData2.addVariant("22");
        questionData2.addVariant("10");
        questionData2.addVariant("15");
        questionData2.addVariant("2");
        data.add(questionData2);

        QuestionData questionData3 = new QuestionData("1 + 1 * 1 = ?", "2");
        questionData3.addVariant("2");
        questionData3.addVariant("1");
        questionData3.addVariant("3");
        questionData3.addVariant("9");
        data.add(questionData3);

        QuestionData questionData4 = new QuestionData("5 % 2 = ?", "1");
        questionData4.addVariant("2.5");
        questionData4.addVariant("1");
        questionData4.addVariant("2");
        questionData4.addVariant("1.5");
        data.add(questionData4);

        QuestionData questionData5 = new QuestionData("1 + 5 * 3 = ?", "16");
        questionData5.addVariant("16");
        questionData5.addVariant("15");
        questionData5.addVariant("18");
        questionData5.addVariant("20");
        data.add(questionData5);

        QuestionData questionData6 = new QuestionData("0 % 5 != 0", "False");
        questionData6.addVariant("True");
        questionData6.addVariant("False");
        data.add(questionData6);

        QuestionData questionData7 = new QuestionData("Is Java JavaScript ?", "False");
        questionData7.addVariant("True");
        questionData7.addVariant("False");
        data.add(questionData7);

        QuestionData questionData8 = new QuestionData("if (sad() === true) {\nsad().stop();\n    beAwesome();\n}", "True");
        questionData8.addVariant("True");
        questionData8.addVariant("False");
        data.add(questionData8);

        QuestionData questionData9 = new QuestionData("var = 'Xusan' * 2 * 2", "XusanXusanXusanXusan");
        questionData9.addVariant("Error");
        questionData9.addVariant("Xusan4");
        questionData9.addVariant("XusanXusanXusanXusan");
        data.add(questionData9);

        return data;
    }
}
