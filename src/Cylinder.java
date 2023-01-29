public class Cylinder extends SolidOfRevolution{
    private final double height;

    public Cylinder (double height, double radius) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
