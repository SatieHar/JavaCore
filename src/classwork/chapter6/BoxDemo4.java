package classwork.chapter6;

public class BoxDemo4 {
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

        vol = mybox1.volume();
        System.out.println("Volume is:" + vol);

        vol = mybox2.volume();
        System.out.println("Volume is:" + vol);

        // or another short version -  System.out.println("Volume is:" + mybox1.volume());
    }
}
