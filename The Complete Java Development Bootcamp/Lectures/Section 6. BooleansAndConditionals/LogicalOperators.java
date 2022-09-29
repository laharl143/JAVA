public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";
        //OR operator ; if one is true, the condition is true
        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulation, you got the scholarship!");
        } else {
            System.out.println("we're sorry, you didn't get the scholarship");
        }

        int credits = 56;
        double GPA = 3.2;
        //AND operator ; all should be true to consider the condition true
        if (credits >= 40 && GPA >= 2.00) {
            System.out.println("Congratulations! You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimum of 2.00 GPA");
        }
    }    
}
