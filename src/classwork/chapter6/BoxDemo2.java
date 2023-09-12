package classwork.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10; // assign values to mybox1's instance var.
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3; // assign values to mybox2's instance var.
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.depth * mybox1.height; // compute vol of mybox1
        System.out.println(" Volume is: " + vol);

        vol = mybox2.width * mybox2.depth * mybox2.height; // compute vol of mybox2
        System.out.println(" Volume is: " + vol);
    }
}
