package org.launchcode.quiz.question;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class CheckboxQuestion extends AbstractQuestion {

    private String[] choices;
    private int[] responses;
    private int[] answers;

    public CheckboxQuestion(String text, String[] choices, int[] answers) {
        super(text);
        this.choices = choices;
        this.answers = answers;
    }

    public CheckboxQuestion(String text, String[] choices, int[] answers, int pointValue) {
        super(text, pointValue);
        this.choices = choices;
        this.answers = answers;
    }

    @Override
    public void displayQuestion() {
        System.out.println(this.getText() + " (choose all that apply, separating your selections by a comma)");
        for (int i = 0; i < this.choices.length; i++) {
            System.out.println(i + " - " + choices[i]);
        }
    }

    @Override
    public void collectResponse(Scanner input) {
        String responseStr = input.nextLine();
        String[] individualResponses = responseStr.split(",");
        int numResponses = individualResponses.length;

        // remove any spaces from the responses
        for (int i = 0; i < numResponses; i++) {
            individualResponses[i] = individualResponses[i].trim();
        }

        this.responses = new int[numResponses];
        for (int i = 0; i < numResponses; i++) {
            this.responses[i] = Integer.parseInt(individualResponses[i]);
        }
    }

    @Override
    public int gradeResponse() {
        Arrays.sort(this.answers);
        Arrays.sort(this.responses);
        return Arrays.equals(this.answers, this.responses) ? this.getPointValue() : 0;
    }

}
