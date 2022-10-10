public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(4.3, 2.2, "area");   //inside the parenthesis are arguments
        double measure2 = measureRectangle(3.2, 4.1, "perimeter");   
     

        stringPrinter(4.3, 2.2, measure1, "area");
        stringPrinter(3.2, 4.1, measure2, "perimeter");

    }

    public static double measureRectangle (double length, double width, String option) { //"double" after the "static" is the return type
        if (length < 0 || width < 0 ){          //this is used to avoid a negative input
            System.out.println("length or width cannot be negative");
            System.exit(0);         //this is used to exit application or shuts the program down

        }
        switch (option) {
            case "area": return length * width;     //no need to add the break keyword since return automatically breaks the function
            case "perimeter": return 2 * (length + width);
            default: return 404; 
        }
    
    }
    public static void stringPrinter(double length, double width, double measure, String option) {  //"void" means the function has no return value
        System.out.println("The " + option + " of a rectangle with length " + length + " and width " + width + " is equal to " + measure + "\n");
    }
}

/* 
final output:
The area of a rectangle with length 4.3 and width 2.2 is equal to 9.46

The area of a rectangle with length 3.2 and width 4.1 is equal to 13.12

The area of a rectangle with length 3.5 and width 1.2 is equal to 4.2

The area of a rectangle with length 1.6 and width 5.6 is equal to 8.959999999999999

The area of a rectangle with length 10.1 and width 0.7 is equal to 7.069999999999999

The area of a rectangle with length 20.2 and width 5.6 is equal to 113.11999999999999
*/