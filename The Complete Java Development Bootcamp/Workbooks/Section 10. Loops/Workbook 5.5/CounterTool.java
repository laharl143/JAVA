import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...\n");

      /* Task 1 – Get integers from the user.


          1.   print : Pick a number to count by:
               pick up the user's answer
        
          2.   print : Pick a number to start counting from:
               pick up the user's answer

          3.    print : Pick a number to count to:
                pick up the user's answer 
                
        */
        System.out.print(" 1. Pick a number to count by: ");
        int numberStep = scan.nextInt();

        System.out.print(" 2. Pick a number to start counting from: ");
        int numberStart = scan.nextInt();

        System.out.print(" 3. Pick a number to count to: ");
        int numberStop = scan.nextInt();

      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number. 
            3. counts in steps of the first.
      */
        for (int i = numberStart; i <= numberStop; i += numberStep) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}

/*
final output:
I hear you like to count by threes

Jimmy: It depends.
Oh, ok...

 1. Pick a number to count by: 3
 2. Pick a number to start counting from: 6
 3. Pick a number to count to: 66
6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 
 */