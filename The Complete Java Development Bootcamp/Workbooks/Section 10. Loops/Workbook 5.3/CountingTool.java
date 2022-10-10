import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*Task 1 – Choose a number

            Ask: Hi Timmy! Choose a number to count to: 

            Make sure Timmy can enter the value BESIDE the question. 
        */

        System.out.print("Hi Timmy! Choose a number to count to: ");
        int chooseNumber = scan.nextInt();



        /* Task 2 – Count from 0 to that number

             Let's say Timmy entered 5, you would display: 0 1 2 3 4 5 

        */
        System.out.println("Great! Here's how it's done");

        for (int i = 1; i <= chooseNumber; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}

/*
final output:
Hi Timmy! Choose a number to count to: 7        //input: 7
Great! Here's how it's done
1 2 3 4 5 6 7 
 */