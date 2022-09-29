public class WeatherNetwork {
    public static void main(String[] args) {

        double temp = -0.00000009;  
        if ( temp >= -15 && temp <= 0) {
            System.out.println("The forecast is FREEZING! Stay Home!");
        } else if (temp >= 0 && temp <= 10) {
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. go outside!");
        }

    }
}

/*
final output:
>>The forecast is FREEZING! Stay Home!
 */
