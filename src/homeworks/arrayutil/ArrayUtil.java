package homeworks.arrayutil;

public class ArrayUtil {
    int numbers[] = {1, 6, 3, 9, 15, 52, -3, 5, 8};
    int sum;
    void taskOne() {
        System.out.println("TASK 1");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    void taskTwo() {
        System.out.println("TASK 2");
        System.out.print("The first value is: " + numbers[0]);
        System.out.println("\n");
    }

    void taskThree() {
        System.out.println("TASK 3");
        System.out.print("The last value is: " + numbers[numbers.length - 1]);
        System.out.println("\n");
    }

    void taskFour() {
        System.out.println("TASK 4");
        System.out.println("Lenght is: " + numbers.length);
        System.out.println("\n");
    }

    void taskFive() {
        System.out.println("TASK 5");
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min value is: " + min);
        System.out.println("\n");
    }

    void taskSix() {
        System.out.println("TASK 6");
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.println("The mid value is: " + numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
            } else {
                System.out.println("The mid value is: " + numbers[numbers.length / 2]);
            }
        } else {
            System.out.println("can't print middle values.");
        }
        System.out.println("\n");
    }

    void taskSeven() {
        System.out.println("TASK 7");
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.print("The total number of even values is: " + evenCount);
        System.out.println("\n");
    }

    void taskEight() {
        System.out.println("TASK 8");
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.print("The total number of odd values is: " + oddCount);
        System.out.println("\n");
    }

    void taskNine() {
        System.out.println("TASK 9");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of values is: " + sum);
        System.out.println("\n");
    }

    void taskTen() {
        System.out.println("TASK 10");
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The average of values is: " + sum / numbers.length);
        System.out.println("\n");
    }
}








