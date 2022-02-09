package org.launchcode.quiz.question;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public abstract class AbstractQuestion {

    private String text;
    private int pointValue = 1;

    public AbstractQuestion(String text) {
        this.text = text;
    }

    public AbstractQuestion(String text, int pointValue) {
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
