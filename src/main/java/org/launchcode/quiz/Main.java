package org.launchcode.quiz;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new ShortAnswerQuestion("What is your favorite color?", "green"));
        quiz.addQuestion(new TrueFalseQuestion("Cheese is delicious", true));

        String[] choices = {"Charlotte", "Asheville", "Raleigh", "Greensboro"};
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of North Carolina?", choices, 2));

        quiz.runQuiz();
    }

}
