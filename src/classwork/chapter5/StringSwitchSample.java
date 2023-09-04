package classwork.chapter5;

public class StringSwitchSample {
    public static void main(String[] args) {
        System.out.println();
        String str = "two";
        switch (str) {
            case "one":
                System.out.println(" one ");
                break;
            case "two":
                System.out.println(" two ");
                break;
            case "three":
                System.out.println(" three ");
                break;
            default:
                System.out.println(" no match ");
                break;
        }

    }
}
