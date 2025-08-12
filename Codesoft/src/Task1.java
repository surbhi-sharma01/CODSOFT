// Number Guessing Game
// By : Surbhi Sharma


package com.company;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random  = new Random();


         int score =0;
         int round =1;
         boolean nextRound = true;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("In each round, you have 10 attempts to guess the correct number");

        //Game loop
        while(nextRound){
            boolean guessCorrect = false;

            int attempts=1;

            // generating random number between 1 and 100
            int number = random.nextInt(100) + 1;
            System.out.println("Round " + round );
            while(attempts<=10){
                System.out.print("Guess the number (between 1 and 100): ");

                if(!sc.hasNextInt()) {
                    System.out.println("Invalid input! please enter a number");

                    sc.next();
                    continue;
                }


                int guessNumber = sc.nextInt();

                if(guessNumber==number){
                    guessCorrect = true;
                    score++;
                    break;
                }
                else if(guessNumber>number){
                    System.out.println("your guess is High!");
                }
                else{
                    System.out.println("your guess is Low!");
                }
                attempts++;

            }

            if(!guessCorrect) {
                System.out.println("You are out of attempts! The correct number was " + number);
            }
            else{
                System.out.println("You guessed in "+attempts + (attempts==1? " attempt":" attempts"));
            }
            System.out.println("Current score = " + score);
            System.out.print("Do you want to play next round?(true/false) ");
            if(sc.hasNextBoolean()){
                nextRound = sc.nextBoolean();
            }
            else{
                nextRound = false;
                sc.next();
            }
            round++;
        }

        sc.close();
        System.out.println("\nThanks for playing! Your final score is "+ score);

    }
}
