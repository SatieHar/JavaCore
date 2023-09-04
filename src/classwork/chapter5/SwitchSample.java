package classwork.chapter5;

public class SwitchSample {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println(" i is zero. ");
                    break;
                case 1:
                    System.out.println(" i is one. ");
                    break;
                case 2:
                    System.out.println(" i is two. ");
                    break;
                case 3:
                    System.out.println(" i is three. ");
                    break;
                default:
                    System.out.println(" i is greater than 3.");
            }
        }

        // another example
        System.out.println();
        String lang = "ARM";
        if (lang.equals("ARM")) { // ".equals" is the same as ==
            System.out.println(" Բարև ");
        } else if (lang.equals(" RU ")) {
            System.out.println(" Привет ");
        } else if (lang.equals(" ENG ")) {
            System.out.println(" HELLO ");
        }
        else{
            System.out.println(" Language is not supported ");
        }
// Another example with switch case (easier to read than the previous one)
        //String lang = "ARM";
        switch (lang) {
            case "ARM":
                System.out.println(" Բարև ");
                break;
            case  "RU":
                System.out.println(" Привет ");
                break;
            case "ENG":
                System.out.println(" HELLO ");
                break;
            default:
                System.out.println(" Language is not supported ");
        }
    }
}


