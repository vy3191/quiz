package org.launchcode.quiz;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public abstract class Question {

    private String text;
    private int pointValue = 1;

    public Question (String text) {
        this.text = text;
    }

    public Question (String text, int pointValue) {
        this.text = text;
        this.pointValue = pointValue;
    }

    abstract public void displayQuestion();

    abstract public void collectResponse(Scanner input);

    abstract public int gradeResponse();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
