package classwork.chapter2;

public class ForSample {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("poxos");
            System.out.println("petros");
        }
        int x;
        for (x = 0; x < 6; x++) {
            System.out.println(" this is x: " + x);
        }
        int y;
        for (y = 0; y < 6; y++) {
            System.out.println((y + 1) + "xxx");
        }
        for (x = 5; x > 0; x--) {
            System.out.print("petros");
            if (x == 2) ;
            System.out.println("poxos");
        }

        for (int m = 10; m > 0; m--) {
            System.out.print(m + " ");
        }

        for (int z = 0; z < 10; z++) {
            z++;
            System.out.println(z + " ");
        }
        for (int u = 0; u < 5; u++) {
            u++; // u=u+1
            System.out.print((u + 1) + " ");
        }

    }
}
