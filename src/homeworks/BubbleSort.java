package homeworks;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));

        // another version 1
        //                    // int[] numbers = {4, 7, 1, 3, 9, 0, 2};
        //                    //        for (int i = 0; i < numbers.length - 1; i++) {
        //                    //            for (int j = 1; j < numbers.length; j++) {
        //                    //
        //                    //                if (numbers[j-1] > numbers[j]) {
        //                    //                    int tmp = numbers[j];
        //                    //                    numbers[j] = numbers[j - 1];
        //                    //                    numbers[j - 1] = tmp;



        //another version 2
        //for (int i = 0; i < numbers.length - 1; i++) {
        //            for (int j = 0; j < numbers.length; j++) {
        //
        //                if (numbers[j] > numbers[j + 1]) { // so it goe to the right
        //                    int tmp = numbers[j];
        //                    numbers[j] = numbers[j + 1];
        //                    numbers[j + 1] = tmp;
    }
}




