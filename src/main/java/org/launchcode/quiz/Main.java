package org.launchcode.quiz;

import org.launchcode.quiz.assignment.AlgebraQuiz;
import org.launchcode.quiz.assignment.Quiz;
import org.launchcode.quiz.question.CheckboxQuestion;
import org.launchcode.quiz.question.MultipleChoiceQuestion;
import org.launchcode.quiz.question.ShortAnswerQuestion;
import org.launchcode.quiz.question.TrueFalseQuestion;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jane");

        Quiz quiz = new Quiz();
        student.addAssignment(quiz);

        quiz.addQuestion(new ShortAnswerQuestion("What is your favorite color?", "green"));
        quiz.addQuestion(new TrueFalseQuestion("Cheese is delicious", true));

        String[] mcChoices = {"Charlotte", "Asheville", "Raleigh", "Greensboro"};
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of North Carolina?", mcChoices, 2));

        String[] cbChoices = {"6", "42", "7", "2"};
        int[] cbAnswers = {2, 3};
        quiz.addQuestion(new CheckboxQuestion("Which of the following are prime numbers?", cbChoices, cbAnswers));

//        quiz.runQuiz();

        double studentGrade = student.calculateGrade();

        System.out.println("The overall grade for " + student.getName() + " is " + studentGrade);
        //Creating new assignment details.
        AlgebraQuiz alQuiz = new AlgebraQuiz();

        String[] algebraChoices1 ={"10", "-10", "0", "1"};
        String[] algebraChoices2 ={"-9 or 9", "9", "-9", "1"};
        alQuiz.addQuestion(new MultipleChoiceQuestion("Solve: x + 20 = 10", algebraChoices1, 1));
        alQuiz.addQuestion(new MultipleChoiceQuestion("Solve: x^2 - 89 = 0", algebraChoices2, 0));

        alQuiz.runAlQuiz();
    }

}
