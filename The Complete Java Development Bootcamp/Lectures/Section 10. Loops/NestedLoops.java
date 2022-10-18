public class NestedLoops {
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            System.out.println("run: " + i);
                for(int j = 0; j < 3; j++) {
                    System.out.println(j);
                }
        }
    }
}

/*
final output:
run: 0
0     
1     
2     
run: 1
0     
1     
2
run: 2
0
1
2
 */