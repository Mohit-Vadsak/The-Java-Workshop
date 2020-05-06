//we can still use classes by writing it out again and again every time we use it in ful form.
//Here when we write the LocalDateTime class, we include java.time in front of it each time before using it. 
package com.packtpub.chapter06;

public class Example02 {
    public static void main(String[] args) {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();

        java.time.DayOfWeek day = localDateTime.getDayOfWeek();

        System.out.println("The week day is: " + day);
    }
}
