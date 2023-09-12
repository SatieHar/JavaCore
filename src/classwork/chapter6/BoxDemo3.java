package classwork.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10; // assign values to mybox1's instance var.
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3; // assign values to mybox2's instance var.
        mybox2.height = 6;
        mybox2.depth = 9;

        // display vol of box1
        mybox1.volume( );

        // display vol of box2
        mybox2.volume( );
    }
}
