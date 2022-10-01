public class Calendar {
    public static void main(String[] args) {
        String day = "Wednesday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check calendar here:
        switch (day) {
            case "Monday": System.out.println("\nSorry, I have to stay at work late."); break;
            case "Tuesday": System.out.println("\nIt looks like I have meetings all day."); break;
            case "Wednesday": System.out.println("\nI have a dentist appointment. Some other time!"); break;
            case "Thursday": System.out.println("\nSorry, thursday is date night!"); break;
            case "Friday": System.out.println("\nI'm free!!"); break;
            case "Saturday": System.out.println("\nI'm free!!"); break;
            case "Sunday": System.out.println("\nI'm free!!"); break;
            case "otherwise": System.out.println("\nthat's not a day."); 
        }
            //  "Monday": print ("Sorry, I have to stay at work late."); 
            //  "Tuesday": print ("It looks like I have meetings all day."); 
            //  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            //  "Thursday": print ("Sorry, thursday is date night!"); 
            //  "Friday": print ("I'm free!!"); 
            //  "Saturday": print ("I'm free!!"); 
            //  "Sunday": print ("I'm free!!"); 
            //  "otherwise": print ("that's not a day."); 

        
        

    }
}

/*
final output:
Hey, are you free on Wednesday? 

Hmm, let me check my calendar.

I have a dentist appointment. Some other time!
 */