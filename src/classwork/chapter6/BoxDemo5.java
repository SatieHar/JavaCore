package classwork.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15 );
        mybox2.setDim(3, 6, 9);

        vol = mybox1.volume();
        System.out.println("Volume is:" + mybox1.volume());

        vol = mybox2.volume();
        System.out.println("Volume is:" + mybox2.volume());
    }
}
