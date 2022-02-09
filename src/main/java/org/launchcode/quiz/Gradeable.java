package org.launchcode.quiz;

/**
 * Created by Chris Bay
 */
public interface Gradeable {

    public int getPointTotal();
    public int getUserScore();
    public double getScorePercentage();
    public String getDisplayScorePercentage();

}
