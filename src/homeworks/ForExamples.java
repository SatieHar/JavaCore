package homeworks;

public class ForExamples {
    public static void main(String[] args) {
        System.out.println(" TASK 1 ");
        for (int i = 0; i <= 999; i++) {
            System.out.print(" - ");
            System.out.print((i + 1));
        }
        System.out.println();
        System.out.println();

        System.out.println(" TASK 2 ");
        for ( int i = 1; i <100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println(" TASK 3 ");
        int array[] = {2, 5, 8, 4, 9, 3, 7};
        int max = 0;
        for (int i = 0; i < 7; i++) {
            if (array [i] > max) {
                max = array [i];
            }
        }
        System.out.print(" The max value is: " + max);
            }


    }
