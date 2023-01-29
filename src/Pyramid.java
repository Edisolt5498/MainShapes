public class Pyramid extends Shape {
    private final double height;
    private final double s;

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    public double getHeight() {
        return height;
    }

    public double getS() {
        return s;
    }
}
