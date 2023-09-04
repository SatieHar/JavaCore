package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println("TASK 1"); // Print all the elements in the array sequentially with spaces
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        System.out.println("TASK 2"); // Print the first value in the array
        int FirstIndex = 0;
        System.out.print("The first value is:" + numbers[FirstIndex]);
        System.out.println("\n");

        System.out.println("TASK 3"); // Print the last value in the array
        int LastIndex = numbers.length - 1;
        System.out.print("The last value is:" + numbers[LastIndex]); // or using the (numbers.length - 1) formula;
        System.out.println("\n");

        System.out.println("TASK 4"); // Print the length of the array
        System.out.println(numbers.length);
        System.out.println("\n");

        System.out.println("TASK 5"); // Print the min value in array
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min value is:" + min);

        // Print the max value in array
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max value in array:" + max);
        System.out.println("\n");

        //System.out.println("TASK 6");
        //numbers [4] = 15;



        System.out.println("TASK 7"); //Print the number of even numbers in the array.
        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens++;
            }
        }
        System.out.print("The total number of even numbers is: " +  evens);
        System.out.println("\n");

        System.out.println("TASK 8"); // Print the number of odd numbers in the array.
        int odds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odds++;
            }
        }
        System.out.print("The total number of even numbers is: " +  odds);
        System.out.println("\n");

        System.out.println("TASK 9"); //Print the sum of elements in array.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of values is: " + sum);
        System.out.println("\n");

        System.out.println("TASK 10");// Print the arithmetic average of the numbers in the array.
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The average of values is: " + sum / numbers.length);
        System.out.println("\n");


    }
}














