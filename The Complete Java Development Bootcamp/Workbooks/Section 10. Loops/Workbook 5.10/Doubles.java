public class Doubles {

    public static void main(String[] args) {
    

        boolean value = false;
    
        while (!value) {
            int dice1 = rollDice();
            int dice2 = rollDice();
                if (dice1 != dice2) {
                rollDice();
                    System.out.println("Dice 1: " +dice1);
                    System.out.println("Dice 2: " +dice2 + "\n");
                }else if (dice1 == dice2) {
                    System.out.println("Dice 1: " +dice1);
                    System.out.println("Dice 2: " +dice2 + "\n");
                    System.out.println("You rolled doubles!");
                    System.exit(0);
                }
    
            }
            
         }
    public static int rollDice() {
        double randomNumber = (int) (Math.floor(Math.random()*6));
        randomNumber += 1;
        return (int)randomNumber;
    
    }
    
    
}

/*
final output:
Dice 1: 6
Dice 2: 2

Dice 1: 3
Dice 2: 2

Dice 1: 6
Dice 2: 3

Dice 1: 4
Dice 2: 2

Dice 1: 3
Dice 2: 5

Dice 1: 6
Dice 2: 2

Dice 1: 6
Dice 2: 6

You rolled doubles!
 */