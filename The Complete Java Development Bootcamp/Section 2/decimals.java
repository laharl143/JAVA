public class decimals {
    public static void main(String[] args) {
        double percentage = 55.7;
        System.out.println("In 2020, " + percentage + "% of the world's population is urban."); 

        double dividend = 25;
        double divisor = 2;
        System.out.println(dividend + " Divided by " + divisor + " = " + dividend/divisor);

  }
}
/*
Output:
In 2020, 55.7% of the world's population is urban.
25.0 Divided by 2.0 = 12.5

 */


/*
Notes:
-"double" is used to store a value with decimal
-you can't use "int" or "long" with a decimal value, it will produce an error
-always use double for math calculations
-avoid int and long for math calculations ; because example if you divide 25/2 using int, it will produce a whole number 12 instead of 12.5

Note Summary:
-use int to store whole numbers
-use long to store very large whole numbers
-use double to store and work with decimals
 */