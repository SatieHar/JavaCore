package homeworks;

public class ArrayUtil1 {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        System.out.println("TASK 2");
        int FirstIndex = 0;
        System.out.print("The first value is: " + numbers[FirstIndex]);
        System.out.println("\n");

        System.out.println("TASK 3");
        int LastIndex = numbers.length - 1;
        System.out.print("The last value is:" + numbers[LastIndex]); // or using the (numbers.length - 1) formula;
        System.out.println("\n");

        System.out.println("TASK 4");
        System.out.println(numbers.length);
        System.out.println("\n");

        System.out.println("TASK 5");
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

        System.out.println("TASK 6");
        int MiddleIndex = numbers[numbers.length / 2];
        System.out.println("The mid number is: " + MiddleIndex);
        if (numbers.length <= 2) {
            System.out.println("can't print middle values.");
        }else {
            System.out.println("The array lenght is: " + numbers.length);
        }
        if (numbers.length % 2 ==0){ //if even
            System.out.println(MiddleIndex - 1);
        }else{ // if odd
            System.out.println(MiddleIndex);
        }
        System.out.println("\n");


        System.out.println("TASK 7");
        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens++;
            }
        }
        System.out.print("The total number of even numbers is: " + evens);
        System.out.println("\n");

        System.out.println("TASK 8");
        int odds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odds++;
            }
        }
        System.out.print("The total number of odd numbers is: " + odds);
        System.out.println("\n");

        System.out.println("TASK 9");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of values is: " + sum);
        System.out.println("\n");

        System.out.println("TASK 10");
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The average of values is: " + sum / numbers.length);
    }
}














