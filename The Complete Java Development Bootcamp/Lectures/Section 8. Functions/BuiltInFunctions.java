public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");     //println() is a built in function   //you can hover to the function to see what their type is(void,double,int,etc)

        double sine = Math.sin(1.2);    //Math.sin() is a built in function
        System.out.println("The sin of 1.2 is: " + sine);

        double power = Math.pow(2, 4);  //Math.pow(base, power) is a built in function 
        System.out.println("2 to the power of 4 is: " + power);

        double random = Math.random(); //Math.random() function doesn't require any parameter to work     //Math.random will only give you a random number from 0-1
        System.out.println("The random value is: " + random);

        double random10 = Math.random() * 10;     //Math.random() will give you random number from 1-10 if you multiply it by 10
        System.out.println("The random value from 1-10 is: " + random10);

        double random100 = Math.random() * 100;     //Math.random() will give you random number from 1-100 if you multiply it by 100
        System.out.println("The random value from 1-100 is: " + random100);
    }
}

/*
final output:
Hello Java
The sin of 1.2 is: 0.9320390859672263
2 to the power of 4 is: 16.0
The random value is: 0.8107875441998507
The random value from 1-10 is: 8.209115794782212
The random value from 1-100 is: 86.71941684212672
 */
