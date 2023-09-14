package classwork.chapter5;

// search an array using for-each style for
public class SearchSample {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int value = 5;
        boolean found = false;

        // use for-each style for to search nums of value
        for (int x : nums) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");
    }
}
