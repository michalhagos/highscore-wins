package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter a game score in Home:Visitor|21:9 format ");
        String myScanner = theScanner.nextLine();

        // Split the string that was given by the user into two base on pipe |
        String[] parts = myScanner.split("\\|");
// Split the parts in to teams  and score based on :
        String[] teams = parts[0].split(":");
        String[] score = parts[1].split(":");
// use Integer.parseInt to change the input from string into integer so that
// to compare it and know the winner
        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);
// use an if statement to compare the scores and assign the winner based on the index
        if (score1 > score2) {
            System.out.println("Winner: " + teams[0]);
        } else {
            System.out.println("Winner : " + teams[1]);
        }

    }
}
