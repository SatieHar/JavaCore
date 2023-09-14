package classwork.chapter5;

//use a for-each style for loop
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) { //use for-each style for display and sum the values
            System.out.println(" Value is: " + x);
            sum += x;
                    }
        System.out.println("Summation: " + sum);
    }
}
