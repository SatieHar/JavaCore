package classwork.chapter3;

public class NumbersArraySample {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 1, 7, 9, 2, 8};
        System.out.println(numbers[0]);
        System.out.println();
        System.out.println(numbers.length - 1);  // to print the last element of array use numbers.length -1
        System.out.println();
        for (int i=0; i<numbers.length; i++ ) {
            System.out.print(numbers [ i ]);
            System.out.println();
        }

        // for chars
        char[] chars = {'%', '#', '@'};
        chars[0] = 'x'; // to change the '%' to 'x'
        System.out.println();
        System.out.println(chars[1]);
        System.out.println();

        // for doubles
        double[] doubles = {5.2, 6.2, 7.2};
        System.out.println(doubles[1]);
    }
}