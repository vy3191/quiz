package org.launchcode.quiz;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new ShortAnswerQuestion("What is your favorite color?", "green"));
        quiz.addQuestion(new ShortAnswerQuestion("What is the answer to the ultimate question?", "42"));
        quiz.addQuestion(new ShortAnswerQuestion("How high is the St. Louis Arch in feet?", "630"));

        quiz.addQuestion(new TrueFalseQuestion("Cheese is delicious", true));
        quiz.addQuestion(new TrueFalseQuestion("Pigs can fly", false));

        quiz.runQuiz();
    }

}
