public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");     //println() is a built in function   //you can hover to the function to see what their type is(void,double,int,etc)

        double sine = Math.sin(1.2);    //Math.sin() is a built in function
        System.out.println("The sin of 1.2 is: " + sine);

        double power = Math.pow(2, 4);  //Math.pow(base, power) is a built in function 
        System.out.println("2 to the power of 4 is: " + power);

        double random = Math.random(); //Math.random function doesn't require any parameter to work
        System.out.println("The random value is: " + random);
    }
}
