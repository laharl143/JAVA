public class Bus {
    public static void main(String[] args) {
        int passengers = 0;
        passengers = passengers + 9;      // you can also use passenger += 9;
        System.out.println(passengers);
        passengers = passengers - 5;      // you can also use passenger -= 5;
        System.out.println(passengers);
        passengers -= 4;                  // <---- like this
        System.out.println(passengers);
    }
}
