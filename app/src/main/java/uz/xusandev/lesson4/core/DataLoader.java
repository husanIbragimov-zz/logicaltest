package uz.xusandev.lesson4.core;

import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<QuestionData> makeData() {
        ArrayList<QuestionData> data = new ArrayList<>();

        QuestionData questionData1 = new QuestionData("Is Python dynamic or static programming language ?", "Dynamic");
        questionData1.addVariant("Dynamic");
        questionData1.addVariant("Static");
        data.add(questionData1);

        QuestionData questionData2 = new QuestionData("In Boolean logic, you compare two items’ values and…", "True or False");
        questionData2.addVariant("True, False, or Undefined");
        questionData2.addVariant("Get any textual value");
        questionData2.addVariant("Get any numerical value");
        questionData2.addVariant("True or False");
        data.add(questionData2);

        QuestionData questionData3 = new QuestionData("1 <= 1", "True");
        questionData3.addVariant("True");
        questionData3.addVariant("False");
        data.add(questionData3);

        QuestionData questionData4 = new QuestionData("1 != 1", "False");
        questionData4.addVariant("False");
        questionData4.addVariant("True");
        data.add(questionData4);

        QuestionData questionData5 = new QuestionData("Fill in the blank (indicated by __) with an appropriate Boolean comparator so that the expression evaluates to True:\n3 __ 4", "<");
        questionData5.addVariant(">");
        questionData5.addVariant("<");
        questionData5.addVariant("==");
        questionData5.addVariant("!=");
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

        QuestionData questionData10 = new QuestionData("123 == \"123\"", "False");
        questionData10.addVariant("Error");
        questionData10.addVariant("False");
        questionData10.addVariant("True");
        data.add(questionData10);

        QuestionData questionData11 = new QuestionData("The Boolean logical operators are:", "and, or, not");
        questionData11.addVariant("and, neither, nor");
        questionData11.addVariant("and, or, not");
        questionData11.addVariant("and, or, but");
        questionData11.addVariant("True, False");
        data.add(questionData11);

        QuestionData questionData12 = new QuestionData("Fill in the blank (indicated by __) with an appropriate Boolean comparator so that the expression evaluates to True:\n10 __ 5", ">");
        questionData12.addVariant(">");
        questionData12.addVariant("<");
        data.add(questionData12);

        QuestionData questionData13 = new QuestionData("(\"A\" != \"A\") or not (2 >= 3)", "True");
        questionData13.addVariant("True");
        questionData13.addVariant("False");
        questionData13.addVariant("None");
        data.add(questionData13);

        QuestionData questionData14 = new QuestionData("The basic mechanism that Python uses to control program flow is the _____ statement.", "If");
        questionData14.addVariant("If");
        questionData14.addVariant("If...elif");
        questionData14.addVariant("elif");
        questionData14.addVariant("else");
        data.add(questionData14);

        QuestionData questionData15 = new QuestionData("What is the type of True and False?", "Boolean");
        questionData15.addVariant("Boolean");
        questionData15.addVariant("Int");
        questionData15.addVariant("String");
        questionData15.addVariant("List");
        data.add(questionData15);

        return data;
    }
}
