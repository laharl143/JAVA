/*
Autocomplete in vscode:
main = public static void main(String[] args)
sout = System.out.println();

////////////////////////////////////////////////////////////////
Good Coding Habit:
class/file name: CamelCase.
variable: lowerCamelCase.

////////////////////////////////////////////////////////////////
-How I wrote this code? Step by step:
-public class boiler plate   line of code #1
-main() boiler plate           line of code #2 + run | Debug
-System.out.println boiler plate    line of code #3
-then I wrote the Hello Java        line of code #3

////////////////////////////////////////////////////////////////
-How to compile and run JAVA code:
-Step 1: write "javac .\<JavaFileName>.java" in terminal, this is to compile the java file
-Step 2: write "java <JavaFileName>".class in terminal to run the compiled file.

////////////////////////////////////////////////////////////////
-FAQS:
-Why use char?
-Memory: char consumes less memory
-Performance: char is faster than string

////////////////////////////////////////////////////////////////
-Rule of thumb:
-Use char to store single characters
-Use String to store text

////////////////////////////////////////////////////////////////
-int variables can only store from -2,147,483,648 to +2,147,483,648  ; only in the 2billion range
     Amount of memory: 4bytes 

-long variables can only store from -9,223,372,036,854,775,807 to +9,223,372,036,854,775,807 ; up to 9 quintillion range
     Amount of memory: 8bytes 

-Why not always use long?
-long takes 8bytes of memory compared to int which is only 4bytes ; hence it is faster

////////////////////////////////////////////////////////////////
-"double" is used to store a value with decimal
-you can't use "int" or "long" with a decimal value, it will produce an error
-always use double for math calculations
-avoid int and long for math calculations ; because example if you divide 25/2 using int, it will produce a whole number 12 instead of 12.5

-use int to store whole numbers
-use long to store very large whole numbers
-use double to store and work with decimals

////////////////////////////////////////////////////////////////
Data Types
int: whole numbers
long: large whole numbers
double: decimals
char: characters
boolean: true of false
String: text    !!!!//always take note that "S" in String is always capital

////////////////////////////////////////////////////////////////
Operators: (reference: Section 2/MethodOperations.java )
+ (plus)
- (minus)
* (multiply)
/ (divide)
% (modulus) - returns the remainder of a division ; modulus is often used to identify odd or even numbers
++ (add 1)  - increases the value by 1
-- (subtract 1) - decreases the value by 1
+= (add by) - increases the value by number on the right
-= (subtract by) - decreases the value by number on the right

////////////////////////////////////////////////////////////////
Scanner: (reference: Section 2/Survey.java)
import java.util.Scanner;   //library
Scanner scan = new Scanner(System.in);  //this is standard variable for scanner; always use this format if you use scanner
scan.close(); //always use this line of code after using scan to refrain from memory leak

nextLine() to scan for a String value
nextInt() to scan for a integer value
nextDouble() to scan for a double value
nextLong(): to scan for a long value.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Section 7: Booleans

Comparison || Comparison Name:
>       greater than
<       less than
>=      greater than or equal
<=      less than or equal
==      equal to
!=      not equal to
equals  equal to (for String)       //example: (sentence1.equals(sentence2))
!equals not equal to (for String)   //example: (!sentence1.equals(sentence2))

////////////////////////////////////////////////////////////////
If, Else Statement Logic

if (true) {                                 //if the statement is true, it will print the if statement
            System.out.println("Hello");       
        } else {
            System.out.println("Goodbye");
        }
output: Hello

if (false) {                                //if the statement is false, it will print the else statement
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
output: Goodbye

////////////////////////////////////////////////////////////////
Logical Operators   --(reference:../section 6/LogicalOperators.java)

OR operator: ||    //the condition is true if either or one of the comparison is true
AND operator: &&   //the condition is only true if both of the comparison is true

////////////////////////////////////////////////////////////////
Switch Statements --(reference:../section 6/SwitchStatements.java)

switch (month) {
            case 1: System.out.println("January"); break; //the break keyword helps to break the cycle of printing the other cases below.
            case 2: System.out.println("February"); break;

Rule: You can only use switch to compare one value against a list of others.
      In any other scenario, use if-else

////////////////////////////////////////////////////////////////
Switch vs If-else
-if-else is used 95% of the time
-if-else runs a piece of code if a condition is true
-switch runs a piece of code if an argument matches a case

////////////////////////////////////////////////////////////////
Delimiters:
scan.nextInt()/scan.nextLong()/scan.nextDouble()  vs scan.nextLine():

/////////////////
What is the value of each variable?
        Scanner scan = new Scanner(System.in);
 
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        double value3 = scan.nextDouble();
        double value4 = scan.nextDouble();
        int value5 = scan.nextInt();
        double value6 = scan.nextDouble();
        double value7 = scan.nextDouble();
>>: 25                                           

>>: 54                                           

>>:      78.3      44.3       25                 

>>:      55.4                                    

>>: 33.2  

value1: 25
value2: 54
value3: 78.3
value4: 44.3
value5: 25
value6: 55.4
value7: 33.2

/////////////////
        Scanner scan = new Scanner(System.in);
 
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();
        String line4 = scan.nextLine();
        String line5 = scan.nextLine();
>>: 25                                  

>>: 54                                  

>>:      78.3      44.3       25        

>>:      55.4                           

>>: 33.2         

value1: 25
value2: 54
value3:  78.3      44.3       25 
value4:  55.4
value5: 33.2

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Section 8: Functions 

The importance of functions     --(ref:/section 6/Chorus.java)
-organized and reusable code

Things to consider:
-write function names using lowerCamelCase
-function and method mean the same thing.

////////////////////////////////////////////////////////////////
Parameters are the inputs inside the function's "()" parenthesis   --(ref:/section 6/Parameters.java)
Arguments are the inputs inside the function's "()" parenthesis when you call the function   --(ref:/section 6/Parameters.java)

////////////////////////////////////////////////////////////////
Return values

What are return values?
-the value that a function returns
-return is the last thing that runs. It breaks the function

System.exit(0);
-is used to exit or terminate a program

////////////////////////////////////////////////////////////////
Doc Comment
-this is used to describe a function using doc comments

/** */       //to make a Doc Comment boiler plate then press enter to automatically detect @param & @return

/*

Example of Doc Comment 
 * Function name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return      (double)
     * 
     * Inside the function:
     * 1. calculate the area and returns it
     */
/* 
////////////////////////////////////////////////////////////////
Scope

Function scope vs. Class scope 
If you make a variable inside a function, it only exists inside the function
If you make a variable inside a class, you can access it from anywhere inside the class

////////////////////////////////////////////////////////////////
Built-in Function  --(ref: BuiltInFunctions.java)
-println(
-Math.sin() 
-Math.pow(base, power)
-Math.random()
-*and more in the internet*

A good developer uses the internet:
-to read documentation
-and find resources
-doesn't memorize thousands of functions!!



 */ 


 
