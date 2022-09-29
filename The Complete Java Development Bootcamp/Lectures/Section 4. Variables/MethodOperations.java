
public class MethodOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets."); 
        System.out.println("There are "+ (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) +"/10 on his potions test. Snape wasn't too thrilled.");

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George."); 
        System.out.println("The Andromeda Galaxy has "+ (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way.");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) +"/10 on his potions test.");

        System.out.println("Fred and George used a special spell to multiply their sweets to:  " + (bagOfSweets2 * bagOfSweets1) + ".");
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * bonusMarks) + "/10.");
        
        System.out.println("Originally, Fred had " + (bagOfSweets2 / bagOfSweets1) + " times more sweets than George."); 
        System.out.println("Andromeda has "+ (starsInAndromeda / starsInMilkyWay) + " times more stars.");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / bonusMarks) +"/10.");

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

        int counter = 0;
        counter++;  //+1
        counter++;  //+1
        counter++;  //+1
        System.out.println("I count: " + counter);  //I count: 3
        counter--;  //-1
        counter--;  //-1
        counter--;  //-1
        System.out.println("I count: " + counter);  //I count: 0

    }
}

/*
Output: 
Fred and George collected 15 sweets.
There are 1002500000000 stars in the Milky Way and Andromeda galaxies.
With bonus marks, Ron scored 9.2/10 on his potions test. Snape wasn't too thrilled.
Fred has 5 more sweets than George.
The Andromeda Galaxy has 997500000000 more stars than the Milky Way.
Snape ended up removing marks. Ron actually scored 4.2/10 on his potions test.
Fred and George used a special spell to multiply their sweets to:  50.
Snape made an error on his excel, accidentally multiplying Ron's score to: 16.75/10.
Originally, Fred had 2 times more sweets than George.
Andromeda has 400 times more stars.
Snape caught the error. Furious, he divided Ron's score to: 2.68/10. 
10 is an even number, since dividing 10 by 2 has a remainder of: 0
5 is an odd number, since dividing 5 by 2 has a remainder of: 1
*/

/*
Notes: 
-an operation between whole numbers returns a whole number.
-an operation between decimals will preserve the decimal.
-we need parenthesis brackets to use an operator (+ - * /)
-if there are no parenthesis brackets, it will just add side by side the int,long,double
*/



