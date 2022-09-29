import java.util.Scanner;   //use this library if using scan
public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //this is standard variable for scanner; always use this format if you use scanner 
        System.out.println("Welcome. Thank you for taking the survey.");

        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();  //this is used to prompt user to input a name (String format)
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble(); //this is used to prompt user to input a coffee price (double format)
        counter++;
        
        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();   //this is used to prompt user to input a food price (double format)
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();  //this is used to prompt user to input how many times they get coffee (int format)
        counter++;

        System.out.println("\nHow many times a week do you buy food?");
        int foodAmount = scan.nextInt();    //this is used to prompt user to input how many times they get food (int format)
        counter++;
        
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");  //"\n" creates a new line of space
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expenses.");  
        System.out.println("Weekly, you spend $" + (coffeeAmount*coffeePrice) + " on coffee.");  
        System.out.println("Weekly, you spend $" + (foodAmount*foodPrice) + " on food.");  
        
        scan.close();   //always use this line of code after using scan to refrain from memory leak 
    }
}
/*
Final output:
Thank you Erskine for answering all 5 questions.
Your fast food expenses are 1.8583333333333334 times your coffee expenses.
Weekly, you spend $3.5999999999999996 on coffee
Weekly, you spend $8.92 on food
 */