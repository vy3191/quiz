package org.launchcode.quiz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chris Bay
 */
@RunWith(JUnit4.class)
public class TestQuiz {

    @Test
    public void testAddQuestionUpdatesPointTotal() {
        Quiz quiz = new Quiz();
        assertEquals(0, quiz.getPointTotal());
        int questionValue = 7;
        Question question = new Question ("Blah blah blah", "yak yak yak", questionValue);
        quiz.addQuestion(question);
        assertEquals(questionValue, quiz.getPointTotal());
    }

}
