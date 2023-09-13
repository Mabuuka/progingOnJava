public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(4.0, 4.0);
        System.out.println(b);
        b.move( 25, -9);
        System.out.println(b);
    }
}
