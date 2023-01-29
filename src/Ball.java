public class Ball extends SolidOfRevolution{
    private final double radius;

    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
        this.radius = radius;
    }
}
