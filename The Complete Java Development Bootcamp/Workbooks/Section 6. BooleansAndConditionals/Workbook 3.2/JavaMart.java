public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if (wallet > toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar; //you paid for the toyCar
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }
        
        double nike = 95.99;       
        System.out.println("\nCan I get these nike shoes?"); //\n to add space above
        if (wallet > nike) {
            System.out.println("Sure!");
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }
    }
}

/*
final output: 
Can I get this car?
Sure!

Can I get these nike shoes?
Sorry, I only have 94.01 left
 */