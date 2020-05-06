package com.packtpub.steps;

import java.time.LocalDate;

/**
 * Holds steps taken (so far) in a day.
 */
//We are using constructor to initialze the variables and using getter and setter set the value and be able
//to call from other files.
public class Steps {
    private int steps;
    private LocalDate date;

    public Steps(int steps, LocalDate date) {
        this.steps = steps;
        this.date = date;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
