package homeworks.sort;

public class ArraySort {
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) { // or  numb to optimize ers.length - i to optimize the code

                if (numbers[j - 1] > numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;
                }
            }
        }

    }
}







