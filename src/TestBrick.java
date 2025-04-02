public class TestBrick {
    public static void main(String[] args) {
        BrickLayout b = new BrickLayout("src/bricks", 40, false);
        b.doOneBrick();
        b.doOneBrick();
        b.printBrickLayout();
    }
}