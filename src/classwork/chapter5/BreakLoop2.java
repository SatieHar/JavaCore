package classwork.chapter5;

//using break to exit a while loop

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10) //terminate loop if it's 10
                break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete. ");
        }
    }

