package org.launchcode.quiz;

import org.launchcode.quiz.assignment.Gradeable;

import java.util.ArrayList;

/**
 * Created by Chris Bay
 */
public class Student {

    private String name;
    private final ArrayList<Gradeable> assignments = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addAssignment(Gradeable assignment) {
        this.assignments.add(assignment);
    }

    public double calculateGrade() {
        int totalPoints = 0;
        int totalUserScore = 0;

        for (Gradeable assignment : assignments) {
            totalPoints += assignment.getPointTotal();
            totalUserScore += assignment.getUserScore();
        }

        return (double) totalUserScore / (double) totalPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
