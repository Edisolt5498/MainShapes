public abstract class SolidOfRevolution extends Shape{
    private double radius;

    protected SolidOfRevolution (double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
