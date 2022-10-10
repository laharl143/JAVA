//Objective: In this workbook, the user has to keep guessing a number until they get it right.

import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        int number = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while (guess != number) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("You got it!");
        scan.close();    
        
    }


}
/*
final output:
I chose a number between 1 and 5. Try to guess it: 1
Guess again: 2
Guess again: 3
Guess again: 4
Guess again: You got it!
 */