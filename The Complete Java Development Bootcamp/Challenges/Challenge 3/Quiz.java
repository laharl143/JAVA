import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String q1 = scan.next();
        //store answer 1
        if (q1.equals("c")) {
            score += 5 ;
        } else {}
        
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String q2 = scan.next();
        //store answer 2
        if (q2.equals("a")) {
            score += 5 ;
        } else {}

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String q3 = scan.next();
        //store answer 3
        if (q3.equals("d")) {
            score += 5 ;
        } else {}

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String q4 = scan.next();
        //store answer 4
        if (q4.equals("a") || q4.equals("b")) {
            score += 5 ;
        } else {}
      
        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score
        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score < 5 || score < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time..");
        }
        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time. 


        scan.close();

    }
}

/*
final output:
1. Which country held the 2016 Summer Olympics?
        a) China
        b) Ireland
        c) Brazil
        d) Italy

c

2. Which planet is the hottest?
        a) Venus
        b) Saturn
        c) Mercury
        d) Mars

a

3. What is the rarest blood type?
        a) O
        b) A
        c) B
        d) AB-Negative

d

4. Which one of these characters is friends with Harry Potter?
        a) Ron Weasley
        b) Hermione Granger
        c) Draco Malfoy

a
Your final score is: 20/20
Wow, you know your stuff!
 */