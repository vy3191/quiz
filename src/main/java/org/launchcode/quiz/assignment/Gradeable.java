package org.launchcode.quiz.assignment;

/**
 * Created by Chris Bay
 */
public interface Gradeable {

    public int getPointTotal();
    public int getUserScore();
    public double getScorePercentage();
    public String getDisplayScorePercentage();

}
