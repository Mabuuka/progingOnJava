public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball();
        Ball b3 = new Ball();
        b1 = new Ball(2, "Green");
        b2 = new Ball(3);
        b3 = new Ball("Blue");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("Ball diameter = " + b1.getDiametr());
        System.out.println("Ball diameter = " + b2.getDiametr());
        System.out.println("Ball diameter = " + b3.getDiametr());
    }
}
