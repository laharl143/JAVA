public class Parameters {
    public static void main(String[] args) {
        measureRectangle(2.2, 4.3);   //inside the parenthesis are arguments
        measureRectangle(3.2, 4.1);   
        measureRectangle(3.5, 1.2);   
        measureRectangle(1.6, 5.6);   
        measureRectangle(10.1, 0.7);   
        measureRectangle(20.2, 5.6);   

    }

    public static void measureRectangle (double length, double width) {    //inside the parenthesis are parameters
        double area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is equal to " + area + ".\n");
    }
}

/*
final output:
The area of the rectangle with length 2.2 and width 4.3 is equal to 9.46.

The area of the rectangle with length 3.2 and width 4.1 is equal to 13.12.

The area of the rectangle with length 3.5 and width 1.2 is equal to 4.2.

The area of the rectangle with length 1.6 and width 5.6 is equal to 8.959999999999999.

The area of the rectangle with length 10.1 and width 0.7 is equal to 7.069999999999999.

The area of the rectangle with length 20.2 and width 5.6 is equal to 113.11999999999999.

 */