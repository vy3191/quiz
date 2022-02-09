package org.launchcode.quiz.assignment;

import org.launchcode.quiz.question.AbstractQuestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class Quiz implements Gradeable {

    private final ArrayList<AbstractQuestion> questions = new ArrayList<AbstractQuestion>();
    private int pointTotal = 0;
    private int userScore = 0;

    public Quiz () {}

    public Quiz (ArrayList<AbstractQuestion> questions) {
        this.questions.addAll(questions);
        for (AbstractQuestion question : this.questions) {
            this.pointTotal += question.getPointValue();
        }
    }

    public void addQuestion(AbstractQuestion question) {
        this.questions.add(question);
        this.pointTotal += question.getPointValue();
    }

    public void runQuiz() {
        System.out.println("Welcome to the quiz. It has " + this.questions.size() + " questions and is worth " + this.pointTotal + " points. Good luck!");

        Scanner input = new Scanner(System.in);

        int currentQuestionNum = 1;
        for (AbstractQuestion question : this.questions) {
            System.out.print("\n" + currentQuestionNum + ". ");
            question.displayQuestion();
            question.collectResponse(input);
            this.userScore += question.gradeResponse();
            currentQuestionNum++;
        }

        input.close();

        System.out.println("\nYour score: " + this.userScore + "/" + this.pointTotal + " (" + this.getDisplayScorePercentage() + ")");
    }

    // returns something like 67% for 2/3
    public double getScorePercentage() {
        return (double) this.userScore / (double) this.pointTotal;
    }

    @Override
    public String getDisplayScorePercentage() {
        double pct = this.getScorePercentage();
        long pctScore = Math.round(pct * 100);
        return pctScore + "%";
    }

    public int getPointTotal() {
        return pointTotal;
    }

    public int getUserScore() {
        return userScore;
    }
}
