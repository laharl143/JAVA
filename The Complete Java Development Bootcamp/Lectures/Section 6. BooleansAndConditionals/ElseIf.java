public class ElseIf {
    public static void main(String[] args) {
        int grade = 65;                                               //value is 65

        if (grade >= 80) {                                            //false, so skip
            System.out.println("You got an A. Congratulations!");        
        } else if ( grade >= 70) {                                    //false, so skip
            System.out.println("You got a B.");
        } else if ( grade >= 60) {                                    //true, so print
            System.out.println("You got a C.");
        } else if ( grade >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You got an F. Try again next time..");
        }
    }
}
/*
final output:
You got a C.
 */