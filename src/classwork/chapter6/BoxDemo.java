package classwork.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10; // assign values to mybox's instance var.
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.depth * mybox.height; // compute vol of box
        System.out.println(" Volume is: " + vol);
    }
}
