package org.launchcode.quiz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chris Bay
 */
public class TestQuiz {

    @Test
    public void testAddQuestionUpdatesPointTotal() {
        Quiz quiz = new Quiz();
        assertEquals(0, quiz.getPointTotal());
        int questionValue = 7;
        ShortAnswerQuestion question = new ShortAnswerQuestion("Blah blah blah", "yak yak yak", questionValue);
        quiz.addQuestion(question);
        assertEquals(questionValue, quiz.getPointTotal());
    }

}
