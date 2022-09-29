public class WholeNumbers {
    public static void main(String[] args) {
        int numberOfFans = 5000;
        System.out.println("There are " + numberOfFans + " fans at the Quidditch games.");

        long globalPopulation = 7000000000L;   //if you use long variable, dont forget to put L
        System.out.println("There are " + globalPopulation + " people on Earth.");

        long dailyGoogleSearches = 5000000000L;
        System.out.println("There are " + dailyGoogleSearches + " google searches.");
    }
}



// Notes: 
// int variables can only store from -2,147,483,648 to +2,147,483,648  ; only in the 2billion range
//      Amount of memory: 4bytes 

// long variables can only store from -9,223,372,036,854,775,807 to +9,223,372,036,854,775,807 ; up to 9 quintillion range
//      Amount of memory: 8bytes 


// Why not always use long?
// long takes 8bytes of memory compared to int which is only 4bytes ; hence it is faster