package org.launchcode.quiz.question;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class MultipleChoiceQuestion extends AbstractQuestion {

    private final String[] choices;
    private int response;
    private int answer;

    // constructors
    public MultipleChoiceQuestion(String text, String[] choices, int answer) {
        super(text);
        this.choices = choices;
        this.answer = answer;
    }

    public MultipleChoiceQuestion(String text, String[] choices, int answer, int pointValue) {
        super(text);
        this.choices = choices;
        this.answer = answer;
        this.setPointValue(pointValue);
    }

    @Override
    public void displayQuestion() {
        System.out.println(this.getText() + " (choose one)");
        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + " - " + choices[i]);
        }
    }

    @Override
    public void collectResponse(Scanner input) {
        this.response = input.nextInt();
        input.nextLine();
    }

    @Override
    public int gradeResponse() {
        return this.response == this.answer ? this.getPointValue() : 0;
    }

    public String[] getChoices() {
        return choices;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
