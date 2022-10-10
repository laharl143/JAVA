import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        //to avoid the user to input a 0 to negative
        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than 1. Shutting game down..");
            System.exit(0);
        }
        //to avoid the user to input a 6 and above
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be higher than 6. Shutting game down..");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers);
        
        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats! You win.");
        } else {
            System.out.println("Sorry! You lose..");
        }
    
        scan.close();
    }
    //function to generate a number from 1-6
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber; //since the math.random is double, you need to convert the double to int using (int) type casting
    }
    
    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
        return (sumOfNumbers > sumDiceRolls && (sumOfNumbers - sumDiceRolls) < 3);


    }

}
/*
Rules:
The user wins if:
-dice rolls sum is smaller than number sum
-And the difference between the two numbers is less than three

final output:
2 4 5
Dice sum = 9. Number sum = 11
Congrats! You win.

 */