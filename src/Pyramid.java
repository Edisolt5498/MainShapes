public class Pyramid implements Shape {
    private final double height;
    private final double s;

    public Pyramid(double height, double s) {
        this.height = height;
        this.s = s;
    }

    @Override
    public double getVolume() {
        return (height * s * 4 / 3);
    }

    public double getHeight() {
        return height;
    }

    public double getS() {
        return s;
    }
}
