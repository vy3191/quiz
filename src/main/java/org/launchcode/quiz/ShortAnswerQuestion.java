package org.launchcode.quiz;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class ShortAnswerQuestion extends Question {

    private String response;
    private String answer;

    public ShortAnswerQuestion(String text, String answer) {
        super(text);
        this.answer = answer;
    }

    public ShortAnswerQuestion(String text, String answer, int pointValue) {
        super(text, pointValue);
        this.answer = answer;
    }

    public void displayQuestion() {
        System.out.println(this.getText());
    }

    public void collectResponse(Scanner input) {
        this.response = input.nextLine();
    }

    public int gradeResponse () {
        return this.response.equals(this.answer) ? this.getPointValue() : 0;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
