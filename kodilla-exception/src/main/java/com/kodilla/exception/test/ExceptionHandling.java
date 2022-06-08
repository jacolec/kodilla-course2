package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String tempVariable = null;

        try {
            tempVariable = secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Something went wrong!");  //throw new RuntimeException(e);
        } finally {
            System.out.println("Just checkin' variables.");
        }
    }
}
