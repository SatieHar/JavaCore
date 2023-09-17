package classwork.chapter5;

//using break with nested loop

public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j==10)  // terminate loop if j is 10
                    break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loop complete.");
    }
}
