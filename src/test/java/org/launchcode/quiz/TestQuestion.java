package org.launchcode.quiz;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.quiz.question.ShortAnswerQuestion;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chris Bay
 */
public class TestQuestion {

    private ShortAnswerQuestion testQuestion;

    @Before
    public void setUp() {
        testQuestion = new ShortAnswerQuestion("What are you?", "walrus", 4);
    }

    @Test
    public void testGradeResponseCorrectlyGradesCorrectResponse() {
        testQuestion.setResponse(testQuestion.getAnswer());
        int grade = testQuestion.gradeResponse();
        assertEquals(testQuestion.getPointValue(), grade);
    }

    @Test
    public void testGradeResponseCorrectlyGradesIncorrectResponse() {
        testQuestion.setResponse("giraffe");
        int grade = testQuestion.gradeResponse();
        assertEquals(0, grade);
    }

}
