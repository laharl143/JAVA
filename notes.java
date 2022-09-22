/*
-How I wrote this code? Step by step:
-public class boiler plate   line of code #1
-main() boiler plate           line of code #2 + run | Debug
-System.out.println boiler plate    line of code #3
-then I wrote the Hello Java        line of code #3

-How to compile and run JAVA code:
-Step 1: write "javac .\<JavaFileName>.java" in terminal, this is to compile the java file
-Step 2: write "java <JavaFileName>".class in terminal to run the compiled file.

-FAQS:
-Why use char?
-Memory: char consumes less memory
-Performance: char is faster than string

-Rule of thumb:
-Use char to store single characters
-Use String to store text

-Notes: 
-int variables can only store from -2,147,483,648 to +2,147,483,648  ; only in the 2billion range
     Amount of memory: 4bytes 

-long variables can only store from -9,223,372,036,854,775,807 to +9,223,372,036,854,775,807 ; up to 9 quintillion range
     Amount of memory: 8bytes 

-Why not always use long?
-long takes 8bytes of memory compared to int which is only 4bytes ; hence it is faster

-"double" is used to store a value with decimal
-you can't use "int" or "long" with a decimal value, it will produce an error
-always use double for math calculations
-avoid int and long for math calculations ; because example if you divide 25/2 using int, it will produce a whole number 12 instead of 12.5

-use int to store whole numbers
-use long to store very large whole numbers
-use double to store and work with decimals


 */