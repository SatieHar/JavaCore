package classwork.chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box(); // коробка с тремя переменными/отделами: w, d, h, уже физически сущ.
        Box myBox2 = new Box();
        myBox.width = 8.8;
        System.out.println(myBox2.depth);
        System.out.println(myBox2.height);
        System.out.println(myBox2.width);
        System.out.println(myBox.depth);
        System.out.println(myBox.height);
        System.out.println(myBox.width);
    }
}
