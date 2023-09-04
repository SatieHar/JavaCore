package homeworks;

public class ForExamples {
    public static void main(String[] args) {
        System.out.println(" TASK 1 ");
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+1);
            if (i !=999){ // if i is not equal to 999 -> print "-"
                System.out.print( " - ");
            }
        }
        // another shorter example for the task 1
        //int count = 1000;
        //for (int i = 0; i < count; i++) {
        // System.out.print(i + 1);
        // if (i != count - 1) {
        //System.out.print(" - ");

        System.out.println();
        System.out.println();

        System.out.println(" TASK 2 ");
        // Version without %
        // for ( int i = 2; i <=100; i=i+2) {
        //            if (i % 2 == 0)
        //                System.out.print(i + " ");

        for ( int i = 1; i <=100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println(" TASK 3 ");
        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int max = array [0]; // 0 (2) is matched as the first maximum
        for (int i = 1; i < array.length; i++) { // as the 0 is 2, which is equal to max (2=2), we can start with the second one (1 - 5)
            if (array [i] > max) {
                max = array [i];
            }
        }
        System.out.print(" The max value is: " + max);
            }
    }
