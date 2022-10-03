public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon, "noon");
        printTemperatures(evening, "evening");
        printTemperatures(midnight, "midnight");
        
    }
    //function:return celsius
    public static double fahrenheitToCelsius (double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;

        return celsius;
    }

     public static void printTemperatures(double fahrenheit, String time) {
        System.out.println("During "+ time + ",the temperature is:");
        System.out.println("in F: " + fahrenheit + " fahrenheit");
        System.out.println("in C: " + fahrenheitToCelsius(fahrenheit) + " celsius\n");
     }

}

/*
During noon,the temperature is:
in F: 77.0 fahrenheit
in C: 25.0 celsius

During evening,the temperature is:
in F: 61.0 fahrenheit
in C: 16.11111111111111 celsius

During midnight,the temperature is:
in F: 55.0 fahrenheit
in C: 12.777777777777779 celsius
 */