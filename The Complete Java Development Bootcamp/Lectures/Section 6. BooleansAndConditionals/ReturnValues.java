public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(4.3, 2.2);   //inside the parenthesis are arguments
        double measure2 = measureRectangle(3.2, 4.1);   
        double measure3 = measureRectangle(3.5, 1.2);   
        double measure4 = measureRectangle(1.6, 5.6);   
        double measure5 = measureRectangle(10.1, 0.7);   
        double measure6 = measureRectangle(20.2, 5.6);   

        stringPrinter(4.3, 2.2, measure1);
        stringPrinter(3.2, 4.1, measure2);
        stringPrinter(3.5, 1.2, measure3);
        stringPrinter(1.6, 5.6, measure4);
        stringPrinter(10.1, 0.7, measure5);
        stringPrinter(20.2, 5.6, measure6);
    }

    public static double measureRectangle (double length, double width) {    //inside the parenthesis are parameters
        double area = length * width;
        return area;
    
    }
    public static void stringPrinter(double length, double width, double area) {
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
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