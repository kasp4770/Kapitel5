package kasp4770;
/*
(Pass or fail) Write a program that prompts a student to enter a Java score. If score is greater or equal to 60 then
display "you pass the exam", otherwise display "you don't pass the exam". Your program ends with input -1.
A Danish version.
*/

import java.util.Scanner;

public class Opgave5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0; //Declaring variable for score to be 0, for the loop code to work

        //Loop
        while (score != -1){ //While score is not -1, it goes on to the next line. Input -1, and it ends the loop.
            System.out.println("Indtast din Java score: ");
            score = input.nextInt(); //prompts the user to enter score value

            if(score < 60){
                System.out.println("Du har ikke bestået eksamenen.");
            }
            if(score > 60){
                System.out.println("Du har bestået eksamenen.");
            }
        }
    }
}
