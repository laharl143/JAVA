import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the JAVA Dealership");
        System.out.println(" . Select option 'a' to buy a car.");
        System.out.println(" . Select option 'b' to sell a car.");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if (budget > 10000) {
                    System.out.println("Great! A Nissan Altima is available for $" + budget);
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    String insurance = scan.next();
                    System.out.println("\nDo you have license? Write 'yes' or 'no'");
                    String license = scan.next();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                        System.out.println("\nSold! Pleasure doing business with you!");
                    } else {
                        System.out.println("\nWe're sorry. You are not eligible..");
                    }

                } else {

                } break;
            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. A pleasure doing business with you.");
                } else {
                    System.out.println("\nSorry, we are not interested!");
                }
            break;
            default: System.out.println("invalid option");
        }
        scan.close();
    }
}

/*
final output:
////////////////////////
#option a:
Welcome to the JAVA Dealership
 . Select option 'a' to buy a car.
 . Select option 'b' to sell a car.
a
What is your budget?
20000
Great! A Nissan Altima is available for $20000

Do you have insurance? Write 'yes' or 'no'
yes

Do you have license? Write 'yes' or 'no'
yes

What is your credit score?
700

Sold! Pleasure doing business with you!

////////////////////////
#option b:
Welcome to the JAVA Dealership
 . Select option 'a' to buy a car.
 . Select option 'b' to sell a car.
b

What is your car valued at?
25000

What is your selling price?
20000

We will buy your car. A pleasure doing business with you.
 */
