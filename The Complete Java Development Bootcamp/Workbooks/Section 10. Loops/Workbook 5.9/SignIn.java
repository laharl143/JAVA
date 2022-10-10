import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java<3";
        /////////////////////////////////////////
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("Username: ");     //pick up username
        String usernameInput = scan.nextLine();
        System.out.print("Password: ");       //pick up password
        String passwordInput = scan.nextLine();

        ///////////////////////////////////
        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */
        while (!usernameInput.equals(username) || !passwordInput.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("Username: ");
            usernameInput = scan.nextLine();
            System.out.print("Password: ");
            passwordInput = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");
        scan.close();

        
    }
}

/*
final output:
Welcome to Javagram! Sign in below

Username: Erskine
Password: Duenas

Incorrect, please try again!

Username: Samantha
Password: Java<3

Sign in successful. Welcome!
 */