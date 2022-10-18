public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
final output:
0
2
4
6
8
10
 */