public abstract class SolidOfRevolution implements Shape{
    protected double radius;

    protected SolidOfRevolution (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
