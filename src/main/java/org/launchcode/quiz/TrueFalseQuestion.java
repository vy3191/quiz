package org.launchcode.quiz;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class TrueFalseQuestion extends Question {

    private boolean response;
    private boolean answer;

    public TrueFalseQuestion(String text, boolean answer) {
        super(text);
        this.answer = answer;
    }

    public TrueFalseQuestion(String text, boolean answer, int pointValue) {
        super(text, pointValue);
        this.answer = answer;
    }

    public void displayQuestion() {
        System.out.println(this.getText() + " (true or false)");
    }

    public void collectResponse(Scanner input) {
        this.response = input.nextBoolean();
    }

    public int gradeResponse() {
        return this.response == this.answer ? this.getPointValue() : 0;
    }

    public boolean getResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
