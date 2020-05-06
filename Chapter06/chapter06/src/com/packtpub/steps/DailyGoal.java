package com.packtpub.steps;

public class DailyGoal {
    int dailyGoal = 10000;

    public DailyGoal(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }
    //getSteps()  is the getter used to get thevalue of the steps.
    public boolean hasMetGoal(Steps steps) {
        if (steps.getSteps() >= dailyGoal) {
            return true;
        }

        return false;
    }
}
