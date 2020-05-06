package com.packtpub.steps;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeeklySteps {
    List<Steps> dailySteps = new ArrayList<>();
    DailyGoal dailyGoal;

    public DayOfWeek bestDay() {
        DayOfWeek best = DayOfWeek.MONDAY;
        //this function is used to get the best day of the week.
        //we iterate through the list by calculating max steps and that particular day is the best day.
        int max = 0;
        for (Steps steps : dailySteps) {
            if (steps.getSteps() > max) {
                max  = steps.getSteps();
                best = steps.getDate().getDayOfWeek();
            }
        }

        return best;
    }

    //get the total number of steps throughout the whole week.
    public int getTotalSteps() {
        int total = 0;
        for (Steps steps : dailySteps) {
            total += steps.getSteps();
        }

        return total;
    }

    public String format() {

        StringBuilder builder = new StringBuilder();
        //StringBuilder is used to manage strings easily. All the addition features is used more efficiently
        builder.append("Total steps: " + getTotalSteps() + "\n");

        for (Steps steps : dailySteps) {
            if (dailyGoal.hasMetGoal(steps)) {
                builder.append("YAY! ");
            } else {
                builder.append("     ");
            }

            builder.append(steps.getDate().getDayOfWeek());
            builder.append(" ");
            builder.append(steps.getSteps());

            DayOfWeek best = bestDay();
            if (steps.getDate().getDayOfWeek() == best) {
                builder.append(" ***** BEST DAY!");
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    public void addDailySteps(int steps, LocalDate date) {

        dailySteps.add(new Steps(steps, date));
    }
    //Generated getter and setters
    public List<Steps> getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(List<Steps> dailySteps) {
        this.dailySteps = dailySteps;
    }

    public DailyGoal getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(DailyGoal dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    public static void main(String[] args) {
        // Initialize sample data.
        DailyGoal dailyGoal = new DailyGoal(10000);

        WeeklySteps weekly = new WeeklySteps();
        weekly.setDailyGoal(dailyGoal);

        int year = 2021;
        int month = 1;
        int day = 4;

        weekly.addDailySteps(11543, LocalDate.of(year, month, day));
        day++;
        weekly.addDailySteps(12112, LocalDate.of(year, month, day));
        day++;
        weekly.addDailySteps(10005, LocalDate.of(year, month, day));
        day++;
        weekly.addDailySteps(10011, LocalDate.of(year, month, day));
        day++;
        weekly.addDailySteps(9000, LocalDate.of(year, month, day));
        day++;
        weekly.addDailySteps(20053, LocalDate.of(year, month, day));
        day++;
        weekly.addDailySteps(20048, LocalDate.of(year, month, day));

        System.out.println(weekly.format());
    }
}
