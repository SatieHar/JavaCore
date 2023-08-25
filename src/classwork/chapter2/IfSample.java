package classwork.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        int num = 50;
        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x now equal to y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x now greater than y");
        }
        if (num < 100) {
            System.out.println("num is less than 100 ");
        }
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println(x + " is less than " + y);
        }
    }
}
