package homeworks.sort;

public class ArraySortTest {
    public static void main(String[] args) { // this method is used just for this array
        ArraySort as = new ArraySort();
        int[] numbers = {4, 7, 1, 3, 9, 0, 2};
        as.sort(numbers); // to give the array

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        //min value
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min value is: " + min);

        //max value
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max value is: " + max);
    }
}
