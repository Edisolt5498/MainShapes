public abstract class Shape {
    private static int count;
    private double volume;
    public double getVolume() {
        return this.volume;
    }

    public Shape (double volume) {
        this.volume = volume;
        count++;
    }
    public static int getCount() {
        return count;
    }
}
