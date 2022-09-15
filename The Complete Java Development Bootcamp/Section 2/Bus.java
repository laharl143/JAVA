public class Bus {
    public static void main(String[] args) {
        String sentence = "Number of passengers: ";
        int passengers = 0;
        passengers = passengers + 9;      // you can also use passenger += 9;
        System.out.println(sentence + passengers);
        passengers = passengers - 5;      // you can also use passenger -= 5;
        System.out.println(sentence + passengers);
        passengers -= 4;                  // <---- like this
        System.out.println(sentence + passengers);
        sentence = "end of shift";
        System.out.println(sentence);
    }
}
