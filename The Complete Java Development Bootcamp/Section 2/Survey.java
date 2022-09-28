import java.util.Scanner;   //use this library if using scan
public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //this is standard variable for scanner; always use this format if you use scanner 
        System.out.println("Welcome. Thank you for taking the survey.");

        System.out.println("What is your name?");
        String name = scan.nextLine();  //this is used to prompt user to input a name (String format)
        
        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble(); //this is used to prompt user to input a coffee price (double format)
        
        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();   //this is used to prompt user to input a food price (double format)
        
        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();  //this is used to prompt user to input how many times they get coffee (int format)
        
        System.out.println("How many times a week do you buy food?");
        int foodAmount = scan.nextInt();    //this is used to prompt user to input how many times they get food (int format)

        scan.close();   //always use this line of code after using scan to refrain from memory leak 
    }
}
/*
Final output:
 
 */